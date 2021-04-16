package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hospital")
public class Hospital {
	
	@Id
	int hos_id;
	@Column
	String hos_user;
	@Column
	String hos_name;
	@Column
	String hos_address;
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hospital(int hos_id, String hos_user, String hos_name, String hos_address) {
		super();
		this.hos_id = hos_id;
		this.hos_user = hos_user;
		this.hos_name = hos_name;
		this.hos_address = hos_address;
	}
	
	public Hospital(int hos_id) {
		super();
		this.hos_id = hos_id;
	}
	public int getHos_id() {
		return hos_id;
	}
	public void setHos_id(int hos_id) {
		this.hos_id = hos_id;
	}
	public String getHos_user() {
		return hos_user;
	}
	public void setHos_user(String hos_user) {
		this.hos_user = hos_user;
	}
	public String getHos_name() {
		return hos_name;
	}
	public void setHos_name(String hos_name) {
		this.hos_name = hos_name;
	}
	public String getHos_address() {
		return hos_address;
	}
	public void setHos_address(String hos_address) {
		this.hos_address = hos_address;
	}
	
	
	
	
}
