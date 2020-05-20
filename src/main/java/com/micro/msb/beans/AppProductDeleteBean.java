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

public class AppProductDeleteBean {

    private Integer rowid;
	private Integer recordId;
	private String productCode;
	private String productName;
	private String productDesc;
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

	public String getProductCode() {
    	return this.productCode;
	}
  
	public void setProductCode(String productCode) {
    	this.productCode = productCode;
	}

	public String getProductName() {
    	return this.productName;
	}
  
	public void setProductName(String productName) {
    	this.productName = productName;
	}

	public String getProductDesc() {
    	return this.productDesc;
	}
  
	public void setProductDesc(String productDesc) {
    	this.productDesc = productDesc;
	}

	public String getCategoryCode() {
    	return this.categoryCode;
	}
  
	public void setCategoryCode(String categoryCode) {
    	this.categoryCode = categoryCode;
	}

}
