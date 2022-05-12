package com.chainsys.classandmethods;




/**
*
* @author mahe3115
* 
*
*/
public class Student {
	
	public final String studentName;
	 private int id;
	 private int dateOfbirth;
	 private String bloodGroup;
	public char[] testStudent;
	public int setId;
	 
	 public Student(String studentname) {
		    this.studentName=studentname;
	 }

	public void Student(String studentname) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDateOfbirth() {
		return dateOfbirth;
	}

	public void setDateOfbirth(int dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

}
