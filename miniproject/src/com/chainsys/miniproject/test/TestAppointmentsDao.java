package com.chainsys.miniproject.test;

import java.util.Calendar;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.pojo.Appointment;

public class TestAppointmentsDao {
    
    public static void testInsertAppointments() {
        
          Appointment newapp=new Appointment();
          newapp.setApp_id(1001);
          Calendar c1= Calendar.getInstance();
          java.util.Date date=c1.getTime();
          newapp.setApp_date(date);
         
          newapp.setDoc_id(101);
          newapp.setPatient_name("ana");
          newapp.setFees_collected(500);
    
          int result =AppointmentDao.insertAppointment(newapp);
          System.out.println(result);
        
    }
    public static void testUpdateDoctor() {
        Appointment oldDoc=AppointmentDao.getAppointmentById(104);
        System.out.println(oldDoc.getApp_id()+" "+oldDoc.getPatient_name()+" "+oldDoc.getDoc_id());
        Appointment newdoc=new Appointment();
        newdoc.setApp_id(105);
        Calendar c1= Calendar.getInstance();
        Date date= c1.getTime();
        newdoc.setApp_date(date);
        newdoc.setDoc_id(101);
        newdoc.setPatient_name("97659675421l");
        newdoc.setFees_collected(900);
        int result =AppointmentDao.updateAppointment(oldDoc);
        System.out.println(result);
    }
     public static void testDeleteD() {
            int result =AppointmentDao.deleteAppointment(105);
            System.out.println(result);
        }
        
            public static void testGetAllAppointments() {
                List<Appointment> alldoc = AppointmentDao.getAllAppointments();
                Iterator<Appointment> docIterator =alldoc.iterator();
                while(docIterator.hasNext()) {
                    Appointment doc =docIterator.next();
                    System.out.println(doc.getApp_id()+" "+doc.getPatient_name()+" "+doc.getDoc_id());
                }
            }
        
        public static void testAppointmentGetById() {
            Appointment doc =AppointmentDao.getAppointmentById(103);
            System.out.println(doc.getDoc_id()+" " +doc.getPatient_name()+" "+doc.getDoc_id());
        }

    }