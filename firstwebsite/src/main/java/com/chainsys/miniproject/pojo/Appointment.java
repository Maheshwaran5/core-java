package com.chainsys.miniproject.pojo;

import java.util.Date;

public class Appointment {
         
	private int app_id;  
	private Date app_date ;      
	private int doc_id;     
	private String  patient_name ;
	private float fees_collected ;
	String fees_Category;
	
	public int getApp_id() {
		return app_id;
	}
	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}
	public Date getApp_date() {
		return app_date;
	}
	public void setApp_date(Date app_date) {
		this.app_date = app_date;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public float getFees_collected() {
		return fees_collected;
	}
	public void setFees_collected(float fees) {
		this.fees_collected= fees;
		// TODO Auto-generated method stub
		
	}
	public int getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	public String getFees_Category() {
		return fees_Category;
	}
	public void setFees_Catogory(String fees_Category) {
		this.fees_Category = fees_Category;
	}
	


}
