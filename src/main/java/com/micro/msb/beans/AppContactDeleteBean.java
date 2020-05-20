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

public class AppContactDeleteBean {

    private Integer rowid;
	private String username;
	private String subscription;
	private String jid;
	private String nickname;
	private java.util.Date joindate;
	private String show;
	private String status;
	private java.util.Date lastseen;
	private Integer unread;
	private String key;

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

	public String getSubscription() {
    	return this.subscription;
	}
  
	public void setSubscription(String subscription) {
    	this.subscription = subscription;
	}

	public String getJid() {
    	return this.jid;
	}
  
	public void setJid(String jid) {
    	this.jid = jid;
	}

	public String getNickname() {
    	return this.nickname;
	}
  
	public void setNickname(String nickname) {
    	this.nickname = nickname;
	}

	public java.util.Date getJoindate() {
    	return this.joindate;
	}
  
	public void setJoindate(java.util.Date joindate) {
    	this.joindate = joindate;
	}

	public String getShow() {
    	return this.show;
	}
  
	public void setShow(String show) {
    	this.show = show;
	}

	public String getStatus() {
    	return this.status;
	}
  
	public void setStatus(String status) {
    	this.status = status;
	}

	public java.util.Date getLastseen() {
    	return this.lastseen;
	}
  
	public void setLastseen(java.util.Date lastseen) {
    	this.lastseen = lastseen;
	}

	public Integer getUnread() {
    	return this.unread;
	}
  
	public void setUnread(Integer unread) {
    	this.unread = unread;
	}

	public String getKey() {
    	return this.key;
	}
  
	public void setKey(String key) {
    	this.key = key;
	}

}
