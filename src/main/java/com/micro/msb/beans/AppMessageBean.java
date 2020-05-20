/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    
package com.micro.msb.beans;
/*
 *
 * @author Yan Yan Purdiansah
 */
public class AppMessageBean {

    private Integer rowid;
	private String username;
	private String jid;
	private java.util.Date msgtime;
	private String msgtype;
	private String msgsubject;
	private String msgtext;

    public Integer getRowid(){
    	return rowid;
    }
    
    public void setRowid(Integer rowid){
    	this.rowid = rowid;
    }
    
	public String getUsername() {
    	return this.username;
	}
  
	public void setUsername(String username) {
    	this.username = username;
	}

	public String getJid() {
    	return this.jid;
	}
  
	public void setJid(String jid) {
    	this.jid = jid;
	}

	public java.util.Date getMsgtime() {
    	return this.msgtime;
	}
  
	public void setMsgtime(java.util.Date msgtime) {
    	this.msgtime = msgtime;
	}

	public String getMsgtype() {
    	return this.msgtype;
	}
  
	public void setMsgtype(String msgtype) {
    	this.msgtype = msgtype;
	}

	public String getMsgsubject() {
    	return this.msgsubject;
	}
  
	public void setMsgsubject(String msgsubject) {
    	this.msgsubject = msgsubject;
	}

	public String getMsgtext() {
    	return this.msgtext;
	}
  
	public void setMsgtext(String msgtext) {
    	this.msgtext = msgtext;
	}

}
