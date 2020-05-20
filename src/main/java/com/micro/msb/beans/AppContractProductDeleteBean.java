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

public class AppContractProductDeleteBean {

    private Integer rowid;
	private Integer recordId;
	private String contractCode;
	private String contractType;
	private String productCode;
	private String productStatus;
	private java.util.Date startDate;
	private java.util.Date endDate;

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

	public String getContractCode() {
    	return this.contractCode;
	}
  
	public void setContractCode(String contractCode) {
    	this.contractCode = contractCode;
	}

	public String getContractType() {
    	return this.contractType;
	}
  
	public void setContractType(String contractType) {
    	this.contractType = contractType;
	}

	public String getProductCode() {
    	return this.productCode;
	}
  
	public void setProductCode(String productCode) {
    	this.productCode = productCode;
	}

	public String getProductStatus() {
    	return this.productStatus;
	}
  
	public void setProductStatus(String productStatus) {
    	this.productStatus = productStatus;
	}

	public java.util.Date getStartDate() {
    	return this.startDate;
	}
  
	public void setStartDate(java.util.Date startDate) {
    	this.startDate = startDate;
	}

	public java.util.Date getEndDate() {
    	return this.endDate;
	}
  
	public void setEndDate(java.util.Date endDate) {
    	this.endDate = endDate;
	}

}
