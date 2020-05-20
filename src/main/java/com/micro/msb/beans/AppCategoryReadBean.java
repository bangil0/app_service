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

public class AppCategoryReadBean {

    private Integer rowid;
	private Integer recordId;
	private String categoryCode;
	private String categoryName;
	private String categoryDesc;
	private java.util.List<AppDeviceBean> appDevice;
	private java.util.List<AppProductBean> appProduct;
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

	public String getCategoryCode() {
    	return this.categoryCode;
	}
  
	public void setCategoryCode(String categoryCode) {
    	this.categoryCode = categoryCode;
	}

	public String getCategoryName() {
    	return this.categoryName;
	}
  
	public void setCategoryName(String categoryName) {
    	this.categoryName = categoryName;
	}

	public String getCategoryDesc() {
    	return this.categoryDesc;
	}
  
	public void setCategoryDesc(String categoryDesc) {
    	this.categoryDesc = categoryDesc;
	}

	public java.util.List<AppDeviceBean> getAppDevice() {
    	return this.appDevice;
	}
  
	public void setAppDevice(java.util.List<AppDeviceBean> appDevice) {
    	this.appDevice = appDevice;
	}

	public java.util.List<AppProductBean> getAppProduct() {
    	return this.appProduct;
	}
  
	public void setAppProduct(java.util.List<AppProductBean> appProduct) {
    	this.appProduct = appProduct;
	}

	public java.util.List<AppServiceBean> getAppService() {
    	return this.appService;
	}
  
	public void setAppService(java.util.List<AppServiceBean> appService) {
    	this.appService = appService;
	}

}
