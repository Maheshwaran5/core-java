package com.chainsys.haspital.pojo;

import java.util.Date;

public class Appointments extends Doctor{
private int appoint_Id;
private Date appoint_Date;
private int doc_Id;
private String patient_Name;
private String fees_Collected;

public int getAppoint_Id1() {
	return appoint_Id;
}
public void setAppoint_Id(int appoint_Id) {
	this.appoint_Id = appoint_Id;
}
public Date getAppoint_Date() {
	return appoint_Date;
}
public void setAppoint_Date(Date appoint_Date) {
	this.appoint_Date = appoint_Date;
}
public int getDoc_Id() {
	return doc_Id;
}
public void setDoc_Id(int doc_Id) {
	this.doc_Id = doc_Id;
}
public String getPatient_Name() {
	return patient_Name;
}
public void setPatient_Name(String patient_Name) {
	this.patient_Name = patient_Name;
}
public String getFees_Collected() {
	return fees_Collected;
}
public void setFees_Collected(String fees_Collected) {
	this.fees_Collected = fees_Collected;
}
public Date getAppoint_Id() {
	// TODO Auto-generated method stub
	return null;
}
public int getDoc_id() {
	// TODO Auto-generated method stub
	return 0;
}

}
