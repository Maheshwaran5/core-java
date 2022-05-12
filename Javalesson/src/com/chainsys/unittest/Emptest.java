package com.chainsys.unittest;

import com.chainsys.classandmethods.Employee;

public class Emptest {
public static void test() {
	
	testEmpName();
	testCity();
	testSalary();
}
public static void testEmpName() {
	Employee firstEmployee = new Employee(2210);
	firstEmployee.setName("Maheshwaran");
	System.out.println(firstEmployee.getName());
}
public static void testCity() {
	Employee firstEmployee = new Employee(2210);
	firstEmployee.setCity("Madurai");
	System.out.println(firstEmployee.getCity());
}
public static void testSalary() {
	Employee firstEmployee = new Employee(2210);
	firstEmployee.setSalary(30000);
	System.out.println(firstEmployee.getSalary());

}
}
