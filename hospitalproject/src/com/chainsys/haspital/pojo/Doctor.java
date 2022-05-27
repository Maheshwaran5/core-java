package com.chainsys.haspital.pojo;

import java.util.Date;

public class Doctor {
	private int doc_id ;
	private String doc_name; 
	private Date dob ; 
	private String speciality ;
	private String doc_city; 
	private long phone; 
	private float standard_fees; 
	
	public int getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	public String getDoc_name() {
		return doc_name;
	}
	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getDoc_city() {
		return doc_city;
	}
	public void setDoc_city(String doc_city) {
		this.doc_city = doc_city;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public float getstandard_fees() {
		return standard_fees;
	}
	public void setstandard_fees(float standard_fees) {
		this.standard_fees = standard_fees;
	}
	

}