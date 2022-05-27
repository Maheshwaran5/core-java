package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;

public class TestEmployeeDao {
    public static void testGetAllEmployees() {
        List<Employee> allEmployees = EmployeeDao.getAllEmployee();
        ;
        Iterator<Employee> empIterator = allEmployees.iterator();
        while (empIterator.hasNext()) {
            Employee emp = empIterator.next();
            System.out.println(emp.getEMPLOYEE_ID() + " " + emp.getFIRST_NAME() + " " + emp.getSALARY());
        }

    }

    public static void testGetEmployeeById() {
        Employee emp = EmployeeDao.getEmployeeById(126);
        System.out.println(emp.getEMPLOYEE_ID() + " " + emp.getSALARY());
    }

    public static void testInsertEmployee() {
        Employee newemp = new Employee();
        newemp.setEMPLOYEE_ID(300);
        newemp.setFIRST_NAME("babuu");
        newemp.setEmail("tytyt@mail.com");
        newemp.setLAST_NAME("varadharaj");
        newemp.setSALARY(10000);
        Calendar c1 = Calendar.getInstance();
        java.util.Date newDate = c1.getTime();
        newemp.setHIRE_DATE(newDate);
        newemp.setJOB_ID("IT_PROG");

        // newemp.setHire_date(new java.util.Date(22-02-2022));

        int result = EmployeeDao.insertEmployee(newemp);
        System.out.println(result);
    }

    public static void testUpdateEmployee() {
        Employee oldEmp = EmployeeDao.getEmployeeById(125);
        System.out.println(oldEmp.getEMPLOYEE_ID() + " " + oldEmp.getFIRST_NAME() + " " + oldEmp.getSALARY());
        oldEmp.setEMPLOYEE_ID(300);
        oldEmp.setFIRST_NAME("babu");
        oldEmp.setLAST_NAME("nirmal");
        oldEmp.setEmail("babu@gmail.com");
        Calendar c1 = Calendar.getInstance();
        java.util.Date newDate = c1.getTime();
        oldEmp.setHIRE_DATE(newDate);
        oldEmp.setJOB_ID("IT_PROG");
        oldEmp.setSALARY(500000);
        int result = EmployeeDao.updateEmployee(oldEmp);
        System.out.println(result);
    }

    public static void testDeleteEmployee() {
        int result = EmployeeDao.deleteEmployee(300);
        System.out.println(result);

    }
}
