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

public class AppServiceSearchBean {

    private Integer rowid;
	private Integer recordId;
	private String serviceCode;
	private String serviceName;
	private String serviceDesc;
	private String categoryCode;
	private java.util.List<AppServiceBean> appService;

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

	public java.util.List<AppServiceBean> getAppService() {
    	return this.appService;
	}
  
	public void setAppService(java.util.List<AppServiceBean> appService) {
    	this.appService = appService;
	}

}
