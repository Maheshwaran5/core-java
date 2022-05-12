package com.chainsys.unittest;

import com.chainsys.classandmethods.Student;

public class StudentTest {
	
	public static void testStudent() {
		Student sd= new Student(null);
		sd.setId=3115;
		sd.setDateOfbirth(18/12/1997);
		sd.setBloodGroup("B Positive");
		
		System.out.println(sd.testStudent);
		System.out.println(sd.getId());
		System.out.println(sd.getDateOfbirth());
		System.out.println(sd.getBloodGroup());
		
		
	
		
	}

}
