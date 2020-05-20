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

public class AppDeviceWriteBean {

    private Integer rowid;
	private Integer recordId;
	private String deviceCode;
	private String deviceName;
	private String deviceDesc;
	private String categoryCode;

    public Integer getRowid(){
    	return rowid;
    }
    
    public void setRowid(Integer rowid){
    	this.rowid = rowid;
    }
    
	public Integer getRecordId() {
    	return this.recordId;
	}
  
	public void setRecordId(Integer recordId) {
    	this.recordId = recordId;
	}

	public String getDeviceCode() {
    	return this.deviceCode;
	}
  
	public void setDeviceCode(String deviceCode) {
    	this.deviceCode = deviceCode;
	}

	public String getDeviceName() {
    	return this.deviceName;
	}
  
	public void setDeviceName(String deviceName) {
    	this.deviceName = deviceName;
	}

	public String getDeviceDesc() {
    	return this.deviceDesc;
	}
  
	public void setDeviceDesc(String deviceDesc) {
    	this.deviceDesc = deviceDesc;
	}

	public String getCategoryCode() {
    	return this.categoryCode;
	}
  
	public void setCategoryCode(String categoryCode) {
    	this.categoryCode = categoryCode;
	}

}
