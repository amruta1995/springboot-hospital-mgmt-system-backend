package com.example.demo.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="patient")
public class Patient {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
	int p_id;	
	@Column
	String full_name;
	@Column
	String email;
	@Column
	String cnt_no;
	@Column
	String address;
	@Column
	String city;
	@Column
	String gender;
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column
	Date dob;
	
	//@JsonIgnoreProperties("ps")
	 @OneToOne
	@JoinColumn(name = "user_id")
	 //@JoinColumn(name = "user_id")
	User user_id;
	 
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
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
	public User getUser_id() {
		return user_id;
	}
	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}
	
	public Patient(  String full_name, String email, String cnt_no, String address,
			String city, String gender,Date dob, User user_id) {
		super();
		
		
		
		this.full_name = full_name;
		this.email = email;
		this.cnt_no = cnt_no;
		this.address = address;
		this.city = city;
		this.gender = gender;
		this.user_id = user_id;
		this.dob=dob;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
