package com.chainsys.haspital.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.haspital.dao.AppointmentsDao;
import com.chainsys.haspital.pojo.Appointments;





public class AppointmentsUi {
	public static void appointmentOperation() {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.To add new Appointment details");
		System.out.println("2.To update already existing details");
		System.out.println("3.To delete Appointment details");
		System.out.println("4.To View all the Appointment Details");
		System.out.println("5.To view Specific Appointment details");
		int operation=sc.nextInt();
		switch(operation) {
		case 1:
			addNewAppointments();
			break;
		case 2:
			System.out.println("1.To update All Details");
			System.out.println("2.To update patient Name");
			System.out.println("3.To update collected fees");
			int updateOperation=sc.nextInt();
			switch(updateOperation) {
			case 1:
				updateAppDetails();
				break;
			case 2:
				updatePatientName();
				break;
			case 3:
				updateCollectedfees();
				break;
			default:
				System.out.println("enter valid number! please try again");
			}
			break;
		case 3:
			deleteAppointmentDetails();
			break;
		case 4:
			ViewAllAppointmentDetails();
			break;
		case 5:
			viewAppointmentDetails();
			break;
		default :
			System.out.println("enter valid number! please try again");
		}
	}
	
	public static void addNewAppointments() {

		Scanner sc = new Scanner(System.in);
		Appointments app = new Appointments();
		
		System.out.println("Enter the Appointment id:");
		String app_id = sc.nextLine();
		app.setApp_id(Integer.parseInt(app_id));
		
		System.out.println("Enter Appointment Date like \"dd/mm/yyyy\":");
		SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
		String app_date = sc.nextLine();
		try {
			app.setApp_date(appFormate.parse(app_date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Enter Doctor id:");
		String doc_name = sc.nextLine();
		app.setDoc_id(Integer.parseInt(doc_name));
		
		System.out.println("Enter patient Name:");
		String patient = sc.nextLine();
		app.setPatient_name(patient);
		System.out.println("Enter fees collected:");
		String fees_collected = sc.nextLine();
		app.setFees_collected(Integer.parseInt(fees_collected));
		System.out.println("Enter fees catagery:");
		String fees_cat = sc.nextLine();
		app.setFees_catagery(fees_cat);
		int result = AppointmentsDao.insertAppointments(app);
		System.out.println(result + "row inserted");
		sc.close();
	}
	public static void viewAppointmentDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Appointment id:");
		int app_id = sc.nextInt();
		Appointments doc = AppointmentsDao.getAppointmentsById(app_id);
		System.out.println("Appointment id:" + doc.getApp_id());
		System.out.println("Appointment date:" + doc.getApp_date());
		System.out.println("Doctor id:" + doc.getDoc_id());
		System.out.println("fees collected:" + doc.getFees_collected());
		System.out.println("fees catagery:" + doc.getFees_catagery());
		sc.close();
	}
	public static void ViewAllAppointmentDetails() {
		List<Appointments> applist =AppointmentsDao.getAllAppointments();
		Iterator<Appointments> appItr=applist.iterator();
		while(appItr.hasNext()) {
			Appointments app=appItr.next();
			System.out.println("app id:"+app.getApp_id());
		}
	}
	public static void updateAppDetails() {
		Scanner sc = new Scanner(System.in);
		Appointments app = new Appointments();
		
		System.out.println("Enter the Appointment id:");
		String app_id = sc.nextLine();
		app.setApp_id(Integer.parseInt(app_id));
		
		System.out.println("Enter Appointment Date like \"dd/mm/yyyy\":");
		SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
		String app_date = sc.nextLine();
		try {
			app.setApp_date(appFormate.parse(app_date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Enter Doctor id:");
		String doc_name = sc.nextLine();
		app.setDoc_id(Integer.parseInt(doc_name));
		
		System.out.println("Enter patient Name:");
		String patient = sc.nextLine();
		app.setPatient_name(patient);
		System.out.println("Enter fees collected:");
		String fees_collected = sc.nextLine();
		app.setFees_collected(Integer.parseInt(fees_collected));
		System.out.println("Enter fees catagery:");
		String fees_cat = sc.nextLine();
		app.setFees_catagery(fees_cat);
		int result = AppointmentsDao.updateAppointments(app);
		System.out.println(result + "row updated");
		sc.close();
		}
	public static void deleteAppointmentDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Appointment id:");
		int app_id=sc.nextInt();
		int result = AppointmentsDao.deleteAppointments(app_id);
		System.out.println(result+"row deleted");
		sc.close();
	}
	public static void updatePatientName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter patient Name:");
		String patient=sc.nextLine();
		System.out.println("Enter Appointment id:");
		int app_id=sc.nextInt();
		int result=AppointmentsDao.updatePatientName(app_id,patient);
		System.out.println(result+" row updated");
		sc.close();
		
	}
	public static void updateCollectedfees() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter collected fees:");
		float colleted_fees=sc.nextFloat();
		System.out.println("Enter Appointment id:");
		int app_id=sc.nextInt();
		int result=AppointmentsDao.updateCollectedFees(app_id, colleted_fees);
		System.out.println(result+" row updated");
		sc.close();
	}

}
