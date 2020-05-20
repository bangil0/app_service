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

public class AppGroupAuthoritiesNewBean {

    private Integer rowid;
	private Integer groupId;
	private String authority;

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

	public String getAuthority() {
    	return this.authority;
	}
  
	public void setAuthority(String authority) {
    	this.authority = authority;
	}

}
