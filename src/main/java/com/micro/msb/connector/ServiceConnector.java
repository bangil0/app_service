package com.micro.msb.connector;

import com.micro.msb.controller.ServiceController;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author YYPURDI
 */
@Component
public class ServiceConnector extends MqttConnector implements MqttCallback {

    private static final Logger LOG = LoggerFactory.getLogger(ServiceConnector.class.getName());
    
    @Value("${server.mqtt.url}")
    private String url;    
    @Value("${server.mqtt.username}")
    private String username;
    @Value("${server.mqtt.password}")
    private String password;
    @Value("${server.mqtt.domain}")
    private String domain;
    
    @Autowired
    private ServiceController serviceController;
    
    private final List<Object> objectList = new ArrayList<>();
    
    @Override
    public void run() {
        objectList.add(serviceController);
        setController(objectList);
        connect(url,username,password,domain);
        startService();
    }
}
