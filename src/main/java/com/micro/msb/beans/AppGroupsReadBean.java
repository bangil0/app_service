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

public class AppGroupsReadBean {

    private Integer rowid;
	private Integer groupId;
	private String groupName;
	private java.util.List<AppGroupAuthoritiesBean> appGroupAuthorities;
	private java.util.List<AppGroupMembersBean> appGroupMembers;

    public Integer getRowid(){
    	return rowid;
    }
    
    public void setRowid(Integer rowid){
    	this.rowid = rowid;
    }
    
	public Integer getGroupId() {
    	return this.groupId;
	}
  
	public void setGroupId(Integer groupId) {
    	this.groupId = groupId;
	}

	public String getGroupName() {
    	return this.groupName;
	}
  
	public void setGroupName(String groupName) {
    	this.groupName = groupName;
	}

	public java.util.List<AppGroupAuthoritiesBean> getAppGroupAuthorities() {
    	return this.appGroupAuthorities;
	}
  
	public void setAppGroupAuthorities(java.util.List<AppGroupAuthoritiesBean> appGroupAuthorities) {
    	this.appGroupAuthorities = appGroupAuthorities;
	}

	public java.util.List<AppGroupMembersBean> getAppGroupMembers() {
    	return this.appGroupMembers;
	}
  
	public void setAppGroupMembers(java.util.List<AppGroupMembersBean> appGroupMembers) {
    	this.appGroupMembers = appGroupMembers;
	}

}
