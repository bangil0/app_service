/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.micro.msb.connector;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.micro.msb.annotations.MqttMapping;
import com.micro.msb.util.AuthFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class MqttConnector extends Thread implements MqttCallback {

    private static final Logger LOG = LoggerFactory.getLogger(MqttConnector.class.getName());
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private final String serverKey = "wmQ45QjYpC38W3i";
    private final String userKey = "wmQ45QjYpC38W3i";
    
    private String url;
    private String username;
    private String password;
    private String domain;
    
    private MqttClient client;
    private MqttConnectOptions connOpt;
        
    private final Map<String, String> mapTopic = new HashMap<>();
    private final Map<String, Object> mapObject = new HashMap<>();
    private final List<Object> objectList = new ArrayList<>();
    private final Gson gson = new Gson();        
    
    public MqttConnector() {
    }

    protected String generateId() {
        final String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        final int N = alphabet.length();
        Random r = new Random();
        StringBuilder str = new StringBuilder();
        str = str.append(String.valueOf((char) (r.nextInt(26) + 'A')).toUpperCase());
        for (int i = 0; i < 5; i++) {
            str = str.append(alphabet.charAt(r.nextInt(N)));
        }
        return str.toString();
    }

    public String formatDate() {
        return dateFormat.format(new Date());
    }

    public void reconnect() {
        connect(url,username,password,domain);
    }
    
    public void connect(String url,String username,String password, String domain) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.domain = domain;
        try {
            connOpt = new MqttConnectOptions();
            connOpt.setCleanSession(true);
            connOpt.setKeepAliveInterval(30);
            if(username!=null)
                connOpt.setUserName(username);
            if(password!=null)
                connOpt.setPassword(password.toCharArray());

            client = new MqttClient(url,username);
            client.connect(connOpt);
            client.setCallback(this);

        } catch (MqttException me) {
            LOG.error(me.getMessage());
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                LOG.error(e.getMessage());
            }
            reconnect();
            
        } catch (IllegalArgumentException e) {
            LOG.error(e.getMessage());
        }
    }

    public boolean isConnected() {
        if (client==null) return false;
        return client.isConnected();
    }

    public void subscribeTopic(String topic) {
        try {
            client.subscribe(topic);

        } catch (MqttException me) {
            LOG.error(me.getMessage());
        } catch (Exception e) {
            LOG.error(e.getMessage());
        }
    }

    public void publishTopic(String topic, String payload) {
        try {
            MqttTopic iot = client.getTopic(topic);
            MqttMessage message = new MqttMessage();
            message.setPayload(payload.getBytes());
            MqttDeliveryToken token = iot.publish(message);
            token.waitForCompletion();

        } catch (MqttException me) {
            LOG.error(me.getMessage());
            reconnect();
        } catch (Exception e) {
            LOG.error(e.getMessage());
        }
    }

    public void setController(List<Object> objectList){
        this.objectList.addAll(objectList);
    }
    
    public void startService() {     
        try{
            subscribeTopic(username+"@"+domain);
            for(Object obj : objectList){
                Class<?> clazz = obj.getClass();
                for (Method method : clazz.getDeclaredMethods()) {
                    String topic = getTopic(method);
                    if(topic!=null){
                        mapTopic.put(topic,method.getName());
                        mapObject.put(topic, obj);
                        LOG.info(method.getName()+"->Topic:"+topic);
                    }
                }    
            }
        }catch(Exception e){
            LOG.error(e.getMessage());
        }
        
        while (true) {
            try {
                Thread.sleep(5000);
                if(!isConnected()){
                    connect(url,username,password,domain);
                    subscribeTopic(username+"@"+domain);
                }
            } catch (InterruptedException e) {
                LOG.error(e.getMessage());
            }
        }
    }
    
    @Override
    public void messageArrived(String topic, MqttMessage message) throws Exception {
        System.out.println("-------------------------------------------------");
        System.out.println("| Topic     :" + topic);
        System.out.println("| Message Id:" + Integer.toString(message.getId()));
        System.out.println("| Message   :" + new String(message.getPayload()));
        System.out.println("-------------------------------------------------");

        String messageEncrypted = new String(message.getPayload());
        String messageDecrypted = AuthFactory.decryptPassword(messageEncrypted,serverKey);
        
        try{
            ServiceConnector.Payload payloadIn = gson.fromJson(messageDecrypted, ServiceConnector.Payload.class);
            String name = mapTopic.get(payloadIn.getSubject());
            Object obj = mapObject.get(payloadIn.getSubject());
            String encryptedBodyIn = (String) payloadIn.getBody();
            String jsonBodyIn = AuthFactory.decryptPassword(encryptedBodyIn,userKey);

            Payload payloadOut = new Payload();
            payloadOut.setTo(payloadIn.getFrom());
            payloadOut.setFrom(payloadIn.getTo());            
            
            if(name!=null && obj!=null){
                Method method = obj.getClass().getMethod(name,String.class);
                String jsonBodyOut = (String) method.invoke(obj,jsonBodyIn);            
                String encryptedBodyOut = AuthFactory.encryptPassword(jsonBodyOut,userKey);
                payloadOut.setSubject(payloadIn.getSubject());
                payloadOut.setBody(encryptedBodyOut);                
            }            
            else{
                List<String> result = new ArrayList<>(mapTopic.keySet());
                String jsonBodyOut = gson.toJson(result);
                String encryptedBodyOut = AuthFactory.encryptPassword(jsonBodyOut,userKey);
                payloadOut.setBody(encryptedBodyOut);
            }
            
            String json = gson.toJson(payloadOut);
            String jsonEncrypted = AuthFactory.encryptPassword(json,serverKey);
            publishTopic(payloadOut.getTo(),jsonEncrypted);
            LOG.debug(jsonEncrypted);
            
        }catch(JsonSyntaxException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e){
            LOG.error(e.getMessage());
        }
    }
    
    @Override
    public void connectionLost(Throwable cause) {
        System.out.println("connectionLost:"+cause.getMessage());
        reconnect();
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken token) {
        System.out.println("deliveryComplete:"+token.toString());
    }
    
    protected String getTopic(Method method) throws Exception {
        if (method.isAnnotationPresent(MqttMapping.class)) {
            method.setAccessible(true);
            Annotation[] annotations = method.getAnnotations();
            for(Annotation ano : annotations){
                for(Method m : ano.annotationType().getMethods()){
                    if(m.getName().equalsIgnoreCase("value")){
                        String topic = (String) m.invoke(ano);                                        
                        subscribeTopic(topic);
                        return topic;
                    }
                }
            }
        }
        return null;
    }    
    
    public class Payload {
        
        private String to;
        private String from;
        private String subject;
        private String body;

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }
    }
}
