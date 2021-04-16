package com.example.demo.entities;

public class DoctorRegistration {
	
	String user_name;
	String user_pwd;
	String f_name;
	String l_name;
	String email;
	String address;
	String cnt_no;
	String doc_spec;
	String consultancy_fees;
	int hos_id;
	
	
	public DoctorRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DoctorRegistration(String user_name, String user_pwd,String f_name, String l_name, String email, String address, String cnt_no,
			String doc_spec, String consultancy_fees, int hos_id) {
		super();
		this.user_name = user_name;
		this.user_pwd = user_pwd;
		this.f_name = f_name;
		this.l_name = l_name;
		this.email = email;
		this.address = address;
		this.cnt_no = cnt_no;
		this.doc_spec = doc_spec;
		this.consultancy_fees = consultancy_fees;
		
		this.hos_id = hos_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
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

	public int getHos_id() {
		return hos_id;
	}


	public void setHos_id(int hos_id) {
		this.hos_id = hos_id;
	}
	
	
	
	
}