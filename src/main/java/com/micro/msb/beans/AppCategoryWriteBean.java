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

public class AppCategoryWriteBean {

    private Integer rowid;
	private Integer recordId;
	private String categoryCode;
	private String categoryName;
	private String categoryDesc;

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

}
