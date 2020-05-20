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

public class AppGroupsWriteBean {

    private Integer rowid;
	private Integer groupId;
	private String groupName;

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

}
