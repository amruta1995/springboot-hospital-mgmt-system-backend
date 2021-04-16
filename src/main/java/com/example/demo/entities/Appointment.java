package com.example.demo.entities;



import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="appointment")
public class Appointment {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	int app_id;
	@Column
	String status;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column
	@Temporal(TemporalType.DATE)
	Date app_date;
	
	//LocalDate appdate=LocalDate.now().plusDays(1);
	@OneToOne
	@JoinColumn(name="p_id")
	Patient p_id;
	
	@OneToOne
	@JoinColumn(name="doc_id")
	Doctor doc_id; 
	
	@OneToOne
	@JoinColumn(name="s_id")
	Slot s_id;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(String status, Date app_date, Patient p_id, Doctor doc_id, Slot s_id) {
		super();
		this.status = status;
		this.app_date = app_date;
		this.p_id = p_id;
		this.doc_id = doc_id;
		this.s_id = s_id;
	}

	public Appointment(int app_id, String status, Date app_date, Patient p_id, Doctor doc_id, Slot s_id) {
		super();
		this.app_id = app_id;
		this.status = status;
		this.app_date = app_date;
		this.p_id = p_id;
		this.doc_id = doc_id;
		this.s_id = s_id;
	}

	

	public int getApp_id() {
		return app_id;
	}

	public void setApp_id(int app_id) {
		this.app_id = app_id;
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

	public Patient getP_id() {
		return p_id;
	}

	public void setP_id(Patient p_id) {
		this.p_id = p_id;
	}

	public Doctor getDoc_id() {
		return doc_id;
	}

	public void setDoc_id(Doctor doc_id) {
		this.doc_id = doc_id;
	}

	public Slot getS_id() {
		return s_id;
	}

	public void setS_id(Slot s_id) {
		this.s_id = s_id;
	}
	
	
	
}
