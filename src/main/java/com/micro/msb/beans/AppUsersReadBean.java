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

public class AppUsersReadBean {

    private Integer rowid;
	private String username;
	private String password;
	private String name;
	private String email;
	private String phone;
	private String mobile;
	private Integer enabled;
	private String token;
	private java.util.List<AppAuthoritiesBean> appAuthorities;
	private java.util.List<AppContactBean> appContact;
	private java.util.List<AppContractBean> appContract;
	private java.util.List<AppGroupMembersBean> appGroupMembers;
	private java.util.List<AppMessageBean> appMessage;
	private java.util.List<AppPersistentLoginsBean> appPersistentLogins;
	private java.util.List<AppRoomBean> appRoom;

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

	public String getPassword() {
    	return this.password;
	}
  
	public void setPassword(String password) {
    	this.password = password;
	}

	public String getName() {
    	return this.name;
	}
  
	public void setName(String name) {
    	this.name = name;
	}

	public String getEmail() {
    	return this.email;
	}
  
	public void setEmail(String email) {
    	this.email = email;
	}

	public String getPhone() {
    	return this.phone;
	}
  
	public void setPhone(String phone) {
    	this.phone = phone;
	}

	public String getMobile() {
    	return this.mobile;
	}
  
	public void setMobile(String mobile) {
    	this.mobile = mobile;
	}

	public Integer getEnabled() {
    	return this.enabled;
	}
  
	public void setEnabled(Integer enabled) {
    	this.enabled = enabled;
	}

	public String getToken() {
    	return this.token;
	}
  
	public void setToken(String token) {
    	this.token = token;
	}

	public java.util.List<AppAuthoritiesBean> getAppAuthorities() {
    	return this.appAuthorities;
	}
  
	public void setAppAuthorities(java.util.List<AppAuthoritiesBean> appAuthorities) {
    	this.appAuthorities = appAuthorities;
	}

	public java.util.List<AppContactBean> getAppContact() {
    	return this.appContact;
	}
  
	public void setAppContact(java.util.List<AppContactBean> appContact) {
    	this.appContact = appContact;
	}

	public java.util.List<AppContractBean> getAppContract() {
    	return this.appContract;
	}
  
	public void setAppContract(java.util.List<AppContractBean> appContract) {
    	this.appContract = appContract;
	}

	public java.util.List<AppGroupMembersBean> getAppGroupMembers() {
    	return this.appGroupMembers;
	}
  
	public void setAppGroupMembers(java.util.List<AppGroupMembersBean> appGroupMembers) {
    	this.appGroupMembers = appGroupMembers;
	}

	public java.util.List<AppMessageBean> getAppMessage() {
    	return this.appMessage;
	}
  
	public void setAppMessage(java.util.List<AppMessageBean> appMessage) {
    	this.appMessage = appMessage;
	}

	public java.util.List<AppPersistentLoginsBean> getAppPersistentLogins() {
    	return this.appPersistentLogins;
	}
  
	public void setAppPersistentLogins(java.util.List<AppPersistentLoginsBean> appPersistentLogins) {
    	this.appPersistentLogins = appPersistentLogins;
	}

	public java.util.List<AppRoomBean> getAppRoom() {
    	return this.appRoom;
	}
  
	public void setAppRoom(java.util.List<AppRoomBean> appRoom) {
    	this.appRoom = appRoom;
	}

}
