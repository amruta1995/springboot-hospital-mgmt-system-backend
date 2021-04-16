package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int user_id; 
	
	@Column
	String user_name;
	@Column
	String user_pwd;
	@Column
	String user_type;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int user_id,String user_name, String user_pwd, String user_type) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_pwd = user_pwd;
		this.user_type = user_type;
	}


	public User(String user_name, String user_pwd, String user_type) {
		super();
		this.user_name = user_name;
		this.user_pwd = user_pwd;
		this.user_type = user_type;
	}


	public User(String user_name, String user_pwd) {
		super();
		this.user_name = user_name;
		this.user_pwd = user_pwd;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
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


	public String getUser_type() {
		return user_type;
	}


	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	
	
	
}