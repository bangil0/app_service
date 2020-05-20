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

public class AppRoomDeleteBean {

    private Integer rowid;
	private String meetingRoom;
	private String subject;
	private String participant;
	private java.util.Date startDate;
	private java.util.Date endDate;
	private String status;
	private String refValue;

    public Integer getRowid(){
    	return rowid;
    }
    
    public void setRowid(Integer rowid){
    	this.rowid = rowid;
    }
    
	public String getMeetingRoom() {
    	return this.meetingRoom;
	}
  
	public void setMeetingRoom(String meetingRoom) {
    	this.meetingRoom = meetingRoom;
	}

	public String getSubject() {
    	return this.subject;
	}
  
	public void setSubject(String subject) {
    	this.subject = subject;
	}

	public String getParticipant() {
    	return this.participant;
	}
  
	public void setParticipant(String participant) {
    	this.participant = participant;
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

	public String getStatus() {
    	return this.status;
	}
  
	public void setStatus(String status) {
    	this.status = status;
	}

	public String getRefValue() {
    	return this.refValue;
	}
  
	public void setRefValue(String refValue) {
    	this.refValue = refValue;
	}

}
