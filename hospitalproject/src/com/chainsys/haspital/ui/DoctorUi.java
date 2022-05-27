package com.chainsys.haspital.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.haspital.dao.DoctorDao;
import com.chainsys.haspital.pojo.Doctor;



public class DoctorUi {
	public static void doctorOperations() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.To add New Doctor into Table,");
		System.out.println("2.To update already existing details,");
		System.out.println("3.To Delete records of doctors,");
		System.out.println("4.To View all doctors details,");
		System.out.println("5.To View specific doctor details");
		int operation=sc.nextInt();
		switch(operation) {
		case 1:
			addNewDoctor();
			break;
		case 2:
			System.out.println("1.To update all values ");
			System.out.println("2.To update Doctor name only");
			System.out.println("3.To update Standard fees");
			int updateoperation=sc.nextInt();
			switch(updateoperation){
			case 1:
				updateDocDetails();
				break;
			case 2:
				updateDoctorName();
				break;
			case 3:
				updateStandardFees();
				break;
			default:
				System.out.println("enter valid number! please try again");
			}
			break;
			
		case 3:
			deleteDoctordetails();
			break;
		case 4:
			ViewAllEmployeeDetails();
			break;
		case 5:
			viewEmployeeDetails();
			break;
		default:
			System.out.println("enter valid number! please try again");
		}
	}

	public static void addNewDoctor() {

		Scanner sc = new Scanner(System.in);
		Doctor doc = new Doctor();
		System.out.println("Enter the Doctor id:");
		String doc_id = sc.nextLine();
		doc.setDoc_id(Integer.parseInt(doc_id));
		System.out.println("Enter Doctor name:");
		String doc_name = sc.nextLine();
		doc.setDoc_name(doc_name);
		System.out.println("Enter Doctor Date of birth like \"dd/mm/yyyy\":");
		SimpleDateFormat dobFormate = new SimpleDateFormat("dd/MM/yyyy");
		String Dob = sc.nextLine();
		try {
			doc.setDob(dobFormate.parse(Dob));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Enter the Speciality:");
		String speciality = sc.nextLine();
		doc.setSpeciality(speciality);
		System.out.println("Enter city:");
		String city = sc.nextLine();
		doc.setDoc_city(city);
		System.out.println("Enter phone number:");
		Long phone = sc.nextLong();
		doc.setPhone(phone);
		System.out.println("Enter Standard fees:");
		Float std_fees = sc.nextFloat();
		doc.setstandard_fees(std_fees);
		int result = DoctorDao.insertDoctor(doc);
		System.out.println(result + "row inserted");
		sc.close();
	}

	public static void viewEmployeeDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Doctor id:");
		int doc_id = sc.nextInt();
		Doctor doc = DoctorDao.getDoctorById(doc_id);
		System.out.println("Doctor id:" + doc.getDoc_id());
		System.out.println("Doctor Name:" + doc.getDoc_name());
		System.out.println("Date of birth:" + doc.getDob());
		System.out.println("Speciality:" + doc.getSpeciality());
		System.out.println("phone number:" + doc.getPhone());
		System.out.println("Standard fees:" + doc.getstandard_fees());
		sc.close();
	}
	public static void ViewAllEmployeeDetails() {
		List<Doctor> doclist =DoctorDao.getAllDoctors();
		Iterator<Doctor> docItr=doclist.iterator();
		while(docItr.hasNext()) {
			Doctor doc=docItr.next();
			System.out.println("doc id:"+doc.getDoc_id());
		}
	}
	public static void updateDocDetails() {
		Scanner sc = new Scanner(System.in);
		Doctor doc = new Doctor();
		System.out.println("Enter the Doctor id:");
		String doc_id = sc.nextLine();
		doc.setDoc_id(Integer.parseInt(doc_id));
		System.out.println("Enter Doctor name:");
		String doc_name = sc.nextLine();
		doc.setDoc_name(doc_name);
		System.out.println("Enter Doctor Date of birth like \"dd/mm/yyyy\":");
		SimpleDateFormat dobFormate = new SimpleDateFormat("dd/MM/yyyy");
		String Dob = sc.nextLine();
		try {
			doc.setDob(dobFormate.parse(Dob));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Enter the Speciality:");
		String speciality = sc.nextLine();
		doc.setSpeciality(speciality);
		System.out.println("Enter city:");
		String city = sc.nextLine();
		doc.setDoc_city(city);
		System.out.println("Enter phone number:");
		Long phone = sc.nextLong();
		doc.setPhone(phone);
		System.out.println("Enter Standard fees:");
		Float std_fees = sc.nextFloat();
		doc.setstandard_fees(std_fees);
		int result = DoctorDao.updateDoctor(doc);
		System.out.println(result + "row updated");
		sc.close();
	}
	public static void deleteDoctordetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Doctor id:");
		int doc_id=sc.nextInt();
		int result = DoctorDao.deleteDoctor(doc_id);
		System.out.println(result+"row deleted");
		sc.close();
	}
	public static void updateDoctorName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Doctor Name:");
		String doc_name=sc.nextLine();
		System.out.println("Enter Doctor id:");
		int doc_id=sc.nextInt();
		int result=DoctorDao.updateDoctorName(doc_id,doc_name);
		System.out.println(result+" row updated");
		sc.close();
	}
	public static void updateStandardFees() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Doctor Salary:");
		float doc_salary=sc.nextFloat();
		System.out.println("Enter Doctor id:");
		int doc_id=sc.nextInt();
		int result=DoctorDao.updateStandardFees(doc_id,doc_salary);
		System.out.println(result+" row updated");
		sc.close();
	}


}
