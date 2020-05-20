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

public class AppContractNewBean {

    private Integer rowid;
	private Integer recordId;
	private String contractCode;
	private String contractName;
	private String contractStatus;
	private java.util.Date startDate;
	private java.util.Date endDate;
	private String username;

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

	public String getContractName() {
    	return this.contractName;
	}
  
	public void setContractName(String contractName) {
    	this.contractName = contractName;
	}

	public String getContractStatus() {
    	return this.contractStatus;
	}
  
	public void setContractStatus(String contractStatus) {
    	this.contractStatus = contractStatus;
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

	public String getUsername() {
    	return this.username;
	}
  
	public void setUsername(String username) {
    	this.username = username;
	}

}
