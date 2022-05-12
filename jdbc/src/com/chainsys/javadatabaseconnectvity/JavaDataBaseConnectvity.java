package com.chainsys.javadatabaseconnectvity;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JavaDataBaseConnectvity {
	   public static void main(String[] args) {
//		  // JDBC();
		   imageJDBC();
	   }
		   public static void JDBC(){
	    try {
	           Connection myCon  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mahesh365"); 
	           java.sql.Statement mystat = myCon.createStatement();
	           ResultSet myRs  = mystat.executeQuery("select * from employees");
	           while(myRs.next()) {
	               System.out.println(myRs.getString("last_name") + ", " +myRs.getString("first_name"));
	           }
	           myCon.close();
	       }catch(Exception err) {
	           err.printStackTrace();
	       }
	}
	   public static void imageJDBC()
	   {
	   try{  
	       Class.forName("oracle.jdbc.driver.OracleDriver");  
	       Connection con=DriverManager.getConnection(  
	       "jdbc:oracle:thin:@localhost:1521:xe","system","mahesh365");  
	                     
	       PreparedStatement ps=con.prepareStatement("insert into mahesh values(?,?)");  
	       ps.setString(1,"mahesh");  
	         
	       FileInputStream fin=new FileInputStream("D:\\photo\\3115.jpg");  
	       ps.setBinaryStream(2,fin,fin.available());  
	       int i=ps.executeUpdate();  
	       System.out.println(i+" records affected");  
	                 
	       con.close(); 
	       }
	   catch (Exception e) 
	   {
	           e.printStackTrace();
	           }  
	       }
}
