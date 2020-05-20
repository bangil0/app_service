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

public class AppMenusSearchBean {

    private Integer rowid;
	private String name;
	private String link;
	private String display;
	private java.util.List<AppMenusBean> appMenus;

    public Integer getRowid(){
    	return rowid;
    }
    
    public void setRowid(Integer rowid){
    	this.rowid = rowid;
    }
    
	public String getName() {
    	return this.name;
	}
  
	public void setName(String name) {
    	this.name = name;
	}

	public String getLink() {
    	return this.link;
	}
  
	public void setLink(String link) {
    	this.link = link;
	}

	public String getDisplay() {
    	return this.display;
	}
  
	public void setDisplay(String display) {
    	this.display = display;
	}

	public java.util.List<AppMenusBean> getAppMenus() {
    	return this.appMenus;
	}
  
	public void setAppMenus(java.util.List<AppMenusBean> appMenus) {
    	this.appMenus = appMenus;
	}

}
