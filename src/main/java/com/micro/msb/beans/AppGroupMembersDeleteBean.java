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

public class AppGroupMembersDeleteBean {

    private Integer rowid;
	private Integer groupId;
	private Integer groupMemberId;
	private String username;

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

	public Integer getGroupMemberId() {
    	return this.groupMemberId;
	}
  
	public void setGroupMemberId(Integer groupMemberId) {
    	this.groupMemberId = groupMemberId;
	}

	public String getUsername() {
    	return this.username;
	}
  
	public void setUsername(String username) {
    	this.username = username;
	}

}
