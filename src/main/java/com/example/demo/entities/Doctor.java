package com.example.demo.entities;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="doctor")
public class Doctor {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	int doc_id; 
	@Column
	String f_name;
	@Column
	String l_name;
	@Column
	String email  ;
	@Column
	String address ; 
	@Column
	String cnt_no  ;
	@Column
	String doc_spec ;
	@Column
	String consultancy_fees;  
	
	@OneToOne
	@JoinColumn(name="user_id")
	User user_id  ;
	
	@ManyToOne
	@JoinColumn(name="hos_id")
	Hospital hos_id  ;
	
	
	
	
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Doctor(String f_name, String l_name, String email, String address, String cnt_no, String doc_spec,
			String consultancy_fees, User user_id, Hospital hos_id) {
		super();
		this.f_name = f_name;
		this.l_name = l_name;
		this.email = email;
		this.address = address;
		this.cnt_no = cnt_no;
		this.doc_spec = doc_spec;
		this.consultancy_fees = consultancy_fees;
		this.user_id = user_id;
		this.hos_id = hos_id;
	}

  /* public Doctor(String f_name, String l_name, String email, String address, String cnt_no, String doc_spec,
			String consultancy_fees, User user_id) {
	   this.f_name = f_name;
		this.l_name = l_name;
		this.email = email;
		this.address = address;
		this.cnt_no = cnt_no;
		this.doc_spec = doc_spec;
		this.consultancy_fees = consultancy_fees;
		this.user_id = user_id;
		
	}*/





public int getDoc_id() {
		return doc_id;
	}


	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}

	public String getF_name() {
		return f_name;
	}


	public void setF_name(String f_name) {
		this.f_name = f_name;
	}


	public String getL_name() {
		return l_name;
	}


	public void setL_name(String l_name) {
		this.l_name = l_name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCnt_no() {
		return cnt_no;
	}


	public void setCnt_no(String cnt_no) {
		this.cnt_no = cnt_no;
	}


	public String getDoc_spec() {
		return doc_spec;
	}


	public void setDoc_spec(String doc_spec) {
		this.doc_spec = doc_spec;
	}


	public String getConsultancy_fees() {
		return consultancy_fees;
	}


	public void setConsultancy_fees(String consultancy_fees) {
		this.consultancy_fees = consultancy_fees;
	}


	public User getUser_id() {
		return user_id;
	}


	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}


	public Hospital getHos_id() {
		return hos_id;
	}


	public void setHos_id(Hospital hos_id) {
		this.hos_id = hos_id;
	}


	
	

	
	
}