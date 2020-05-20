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

public class AppServiceReadBean {

    private Integer rowid;
	private Integer recordId;
	private String serviceCode;
	private String serviceName;
	private String serviceDesc;
	private String categoryCode;
	private java.util.List<AppServiceAttributeBean> appServiceAttribute;
	private java.util.List<AppServiceRecordsBean> appServiceRecords;

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

	public String getServiceCode() {
    	return this.serviceCode;
	}
  
	public void setServiceCode(String serviceCode) {
    	this.serviceCode = serviceCode;
	}

	public String getServiceName() {
    	return this.serviceName;
	}
  
	public void setServiceName(String serviceName) {
    	this.serviceName = serviceName;
	}

	public String getServiceDesc() {
    	return this.serviceDesc;
	}
  
	public void setServiceDesc(String serviceDesc) {
    	this.serviceDesc = serviceDesc;
	}

	public String getCategoryCode() {
    	return this.categoryCode;
	}
  
	public void setCategoryCode(String categoryCode) {
    	this.categoryCode = categoryCode;
	}

	public java.util.List<AppServiceAttributeBean> getAppServiceAttribute() {
    	return this.appServiceAttribute;
	}
  
	public void setAppServiceAttribute(java.util.List<AppServiceAttributeBean> appServiceAttribute) {
    	this.appServiceAttribute = appServiceAttribute;
	}

	public java.util.List<AppServiceRecordsBean> getAppServiceRecords() {
    	return this.appServiceRecords;
	}
  
	public void setAppServiceRecords(java.util.List<AppServiceRecordsBean> appServiceRecords) {
    	this.appServiceRecords = appServiceRecords;
	}

}
