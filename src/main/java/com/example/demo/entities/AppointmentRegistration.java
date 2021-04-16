package com.example.demo.entities;

import java.util.Date;

public class AppointmentRegistration {
	
	String status;
	Date app_date;
	int p_id;
	int doc_id;
	int s_id;
	
	public AppointmentRegistration() {
		super();
	}

	public AppointmentRegistration(String status, Date app_date, int p_id, int doc_id, int s_id) {
		super();
		this.status = status;
		this.app_date = app_date;
		this.p_id = p_id;
		this.doc_id = doc_id;
		this.s_id = s_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getApp_date() {
		return app_date;
	}

	public void setApp_date(Date app_date) {
		this.app_date = app_date;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public int getDoc_id() {
		return doc_id;
	}

	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	@Override
	public String toString() {
		
		return "status = "+status+"\tp_id = "+p_id+"\tapp_date = "+app_date+"\tdoc_id = "+doc_id+"\ts_id = "+s_id;
	}
	
}