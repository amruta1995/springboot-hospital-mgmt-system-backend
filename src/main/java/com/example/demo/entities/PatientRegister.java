package com.example.demo.entities;

import java.util.Date;

public class PatientRegister {

	String user_name;
	String user_pwd;
	String full_name;
	String email;
	String cnt_no;
	String address;
	String city;
	String gender;
	Date dob;
	public PatientRegister() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientRegister(String user_name, String user_pwd, String full_name, String email, String cnt_no,
			String address, String city, String gender, Date dob) {
		super();
		this.user_name = user_name;
		this.user_pwd = user_pwd;
		this.full_name = full_name;
		this.email = email;
		this.cnt_no = cnt_no;
		this.address = address;
		this.city = city;
		this.gender = gender;
		this.dob = dob;
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
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCnt_no() {
		return cnt_no;
	}
	public void setCnt_no(String cnt_no) {
		this.cnt_no = cnt_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
}
