package com.example.demo.entities;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="slot")
public class Slot {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int s_id;
	@Column
	Time s_from;
	@Column
	Time s_to;

	public Slot() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Slot(int s_id, Time s_from, Time s_to) {
		super();
		this.s_id = s_id;
		this.s_from = s_from;
		this.s_to = s_to;
	
	}
	
	public Slot(Time s_from, Time s_to) {
		super();
		this.s_from = s_from;
		this.s_to = s_to;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public Time getS_from() {
		return s_from;
	}
	public void setS_from(Time s_from) {
		this.s_from = s_from;
	}
	public Time getS_to() {
		return s_to;
	}
	public void setS_to(Time s_to) {
		this.s_to = s_to;
	}	
}