package com.chainsys.haspital.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.chainsys.haspital.pojo.Appointments;


public class AppointmentsDao {
	 public static Connection getConnection() {
		   String drivername = "oracle.jdbc.OracleDriver";
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "system";
			String password = "mahesh365#";
			try {
				Class.forName(drivername);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			Connection con = null;
			try {
				con = DriverManager.getConnection(dbUrl, username, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return con;
	   }
	 
	 private static java.sql.Date convertTosqlDate(java.util.Date date) {
			java.sql.Date sqldate = new java.sql.Date(date.getTime());
			return sqldate;
		}
	 
	 public static int insertAppointment(Appointments newap) {
			String insertquery = "insert into Appointment(appoint_id,appoint_date,doctor_id,patient_name,fees_collected) values (?,?,?,?,?)";
			Connection con = null;
			int rows =0;
//			int rows ;
			PreparedStatement ps = null;
			try {
				con = getConnection();
				ps = con.prepareStatement(insertquery);
				ps.setInt(1, newap.getDoc_Id());
				// convert java.util.Date to java.sql.date
				ps.setDate(2, convertTosqlDate(newap.getAppoint_Id()));
				ps.setInt(3, newap.getDoc_id());
				ps.setString(4, newap.getPatient_Name());
				ps.setString(5,newap.getFees_Collected());
				rows = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return rows;
		}
	 
	 public static int updateAppointment(AppointmentsDao newap) {
			String updatequery = "update appointment set appoint_date=?,doctor_id=?,patient_name=?,fees_collected=? where appoint_id=?";
			Connection con = null;
			int rows =0;
//			int rows ;
			PreparedStatement ps = null;
			try {
				con = getConnection();
				ps = con.prepareStatement(updatequery);
				// convert java.util.Date to java.sql.date
				ps.setDate(1, convertTosqlDate(newap.getAppoint_Date()));
				ps.setInt(2, newap.getDoc_Id());
				ps.setString(3, newap.getPatient_Name());
				ps.setString(4,newap.getFees_Collected());
				ps.setInt(5, newap.getAppoint_Id());
				rows = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return rows;
		}
	 
	 private Date getAppoint_Date() {
		// TODO Auto-generated method stub
		return null;
	}

	private int getAppoint_Id() {
		// TODO Auto-generated method stub
		return 0;
	}

	private String getFees_Collected() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getPatient_Name() {
		// TODO Auto-generated method stub
		return null;
	}

	private int getDoc_Id() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int updatePatientName(int id,String name) {
			String updatequery = "update appointment set patient_name=? where appoint_id=?";
			Connection con = null;
			int rows =0;
//			int rows ;
			PreparedStatement ps = null;
			try {
				con = getConnection();
				ps = con.prepareStatement(updatequery);
				ps.setString(1, name);
				ps.setInt(2, id);
				ps.executeUpdate();
				rows = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return rows;
		}
	 
	 public static int updateFeesCollected(int id,String fees) {
			String updatequery = "update appointment set fees_collected=? where appoint_id=?";
			Connection con = null;
			int rows =0;
//			int rows ;
			PreparedStatement ps = null;
			try {
				con = getConnection();
				ps = con.prepareStatement(updatequery);
				ps.setString(1,fees);
				ps.setInt(2,id);
				rows = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return rows;
		}
	 
	  public static int deleteAppointment(int id) {
			String deletequery = "delete from appointment where appoint_id=?";
			Connection con = null;
			int rows = 0;
			PreparedStatement ps = null;
		
			try {
				con = getConnection();
				ps = con.prepareStatement(deletequery);
				ps.setInt(1, id);
				rows = ps.executeUpdate();	
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return rows;
	   }
	  
	  public static AppointmentsDao getPatientById(int id) {
		    AppointmentsDao ap =null;
			String selectquery = "select appoint_id,appoint_date,doctor_id,patient_name,fees_collected from appointment where appoint_id=?";//need change 
			Connection con = null;
			PreparedStatement ps = null;
			 ResultSet rs  = null;
			try {
				con = getConnection();
				ps = con.prepareStatement(selectquery);
				ps.setInt(1, id);
				rs =ps.executeQuery();
				ap = new AppointmentsDao();
				 while(rs.next()) {
					 ap.setAppoint_Id(rs.getInt(1));
				ap.setAppoint_Date(rs.getDate(2));
				// convert java.util.Date to java.sql.date
				ap.setDoc_Id(rs.getInt(3));
				ap.setPatient_Name(rs.getString(4));
				ap.setFees_Collected(rs.getString(5));
			}} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return ap;
		}
	  
	  public static List<AppointmentsDao> getAllAppoinments(){
			 List<AppointmentsDao> listOfAppointments = new ArrayList<AppointmentsDao>();
			 AppointmentsDao ap =null;
				String selectquery = "select appoint_id,appoint_date,doctor_id,patient_name,fees_collected from appointment";
				Connection con = null;
				PreparedStatement ps = null;
				 ResultSet rs  = null;
				try {
					con = getConnection();
					ps = con.prepareStatement(selectquery);
					rs =ps.executeQuery();
					
					   while(rs.next()) {
						   ap =new AppointmentsDao();
						   
						 ap.setAppoint_Id(rs.getInt(1));
						 ap.setAppoint_Id(rs.getInt(1));
							ap.setAppoint_Date(rs.getDate(2));
							// convert java.util.Date to java.sql.date
							ap.setDoc_Id(rs.getInt(3));
							ap.setPatient_Name(rs.getString(4));
							ap.setFees_Collected(rs.getString(5));
				          listOfAppointments.add(ap);
				        }
				}catch(SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						rs.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					try {
						ps.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			 return listOfAppointments;
		 }
	  
	  
	//  --------------------------------
	  public static List<AppointmentsDao> getInnerJoinDoctorAndAppointment(){
			 List<AppointmentsDao> listOfAppointments = new ArrayList<AppointmentsDao>();
			 AppointmentsDao ap =null;
				String selectquery = "select a.doctor_id,a.name,a.dob,a.speciality,a.city,a.phone_number,a.std_fees,b.appoint_id,b.appoint_date,b.doctor_id,b.patient_name,fees_collected from doctor a,appointment b where a.doctor_id= b.doctor_id";
				Connection con = null;
				PreparedStatement ps = null;
				 ResultSet rs  = null;
				try {
					con = getConnection();
					ps = con.prepareStatement(selectquery);
					rs =ps.executeQuery();
					   while(rs.next()) {
						   ap =new AppointmentsDao();
						   
						   ap.setDoc_Id(rs.getInt(1));
						   ap.setName(rs.getString(2));
						   ap.setDate(rs.getDate(3));
						   ap.setSpeciality(rs.getString(4));
						   ap.setCity(rs.getString(5));
						   ap.setNumber(rs.getString(6));
						   ap.setStd_Fees(rs.getFloat(7));
						   ap.setAppoint_Id(rs.getInt(8));
						   ap.setAppoint_Id(rs.getDate(9));
						   ap.setDoctor_id(rs.getInt(10));
						   ap.setPatient_Name(rs.getString(11));
						   ap.setFees_Collected(rs.getString(12));
				          listOfAppointments.add(ap);
				        }
				}catch(SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						rs.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					try {
						ps.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			 return listOfAppointments;
		 }
	  
	  private void setFees_Collected(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setPatient_Name(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setDoctor_id(int int1) {
		// TODO Auto-generated method stub
		
	}

	private void setAppoint_Id(java.sql.Date date) {
		// TODO Auto-generated method stub
		
	}

	public void setAppoint_Id(int int1) {
		// TODO Auto-generated method stub
		
	}

	private void setStd_Fees(float float1) {
		// TODO Auto-generated method stub
		
	}

	private void setNumber(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setCity(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setSpeciality(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setDate(java.sql.Date date) {
		// TODO Auto-generated method stub
		
	}

	private void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setDoc_Id(int int1) {
		// TODO Auto-generated method stub
		
	}

	public static List<AppointmentsDao> getLeftOuterJoinDoctorAndAppointment(){
			 List<AppointmentsDao> listOfAppointments = new ArrayList<AppointmentsDao>();
			 AppointmentsDao ap =null;
				String selectquery = "select a.doctor_id,a.name,a.dob,a.speciality,a.city,a.phone_number,a.std_fees,b.appoint_id,b.appoint_date,b.doctor_id,b.patient_name,fees_collected from doctor a,appointment b where a.doctor_id= b.doctor_id(+)";
				Connection con = null;
				PreparedStatement ps = null;
				 ResultSet rs  = null;
				try {
					con = getConnection();
					ps = con.prepareStatement(selectquery);
					rs =ps.executeQuery();
					   while(rs.next()) {
						   ap =new AppointmentsDao();
						   
						   ap.setDoc_Id(rs.getInt(1));
						   ap.setName(rs.getString(2));
						   ap.setDate(rs.getDate(3));
						   ap.setSpeciality(rs.getString(4));
						   ap.setCity(rs.getString(5));
						   ap.setNumber(rs.getString(6));
						   ap.setStd_Fees(rs.getFloat(7));
						   ap.setAppoint_Id(rs.getInt(8));
						   ap.setAppoint_Date(rs.getDate(9));
						   ap.setDoctor_id(rs.getInt(10));
						   ap.setPatient_Name(rs.getString(11));
						   ap.setFees_Collected(rs.getString(12));
				          listOfAppointments.add(ap);
				        }
				}catch(SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						rs.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					try {
						ps.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			 return listOfAppointments;
		 }
	  
	  private void setAppoint_Date(java.sql.Date date) {
		// TODO Auto-generated method stub
		
	}

	public static List<AppointmentsDao> getRightOuterJoinDoctorAndAppointment(){
			 List<AppointmentsDao> listOfAppointments = new ArrayList<AppointmentsDao>();
			 AppointmentsDao ap =null;
				String selectquery = "select a.doctor_id,a.name,a.dob,a.speciality,a.city,a.phone_number,a.std_fees,b.appoint_id,b.appoint_date,b.doctor_id,b.patient_name,fees_collected from doctor a,appointment b where a.doctor_id(+)= b.doctor_id";
				Connection con = null;
				PreparedStatement ps = null;
				 ResultSet rs  = null;
				try {
					con = getConnection();
					ps = con.prepareStatement(selectquery);
					rs =ps.executeQuery();
					   while(rs.next()) {
						   ap =new AppointmentsDao();
						   
						   ap.setDoc_Id(rs.getInt(1));
						   ap.setName(rs.getString(2));
						   ap.setDate(rs.getDate(3));
						   ap.setSpeciality(rs.getString(4));
						   ap.setCity(rs.getString(5));
						   ap.setNumber(rs.getString(6));
						   ap.setStd_Fees(rs.getFloat(7));
						   ap.setAppoint_Id(rs.getInt(8));
						   ap.setAppoint_Date(rs.getDate(9));
						   ap.setDoctor_id(rs.getInt(10));
						   ap.setPatient_Name(rs.getString(11));
						   ap.setFees_Collected(rs.getString(12));
				          listOfAppointments.add(ap);
				        }
				}catch(SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						rs.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					try {
						ps.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			 return listOfAppointments;
		 }
	  
	  public static List<AppointmentsDao> getFullOuterJoinDoctorAndAppointment(){
			 List<AppointmentsDao> listOfAppointments = new ArrayList<AppointmentsDao>();
			 AppointmentsDao ap =null;
				String selectquery = "select a.doctor_id,a.name,a.dob,a.speciality,a.city,a.phone_number,a.std_fees,b.appoint_id,b.appoint_date,b.doctor_id,b.patient_name,fees_collected from doctor a full outer join appointment b on a.doctor_id= b.doctor_id";
				Connection con = null;
				PreparedStatement ps = null;
				 ResultSet rs  = null;
				try {
					con = getConnection();
					ps = con.prepareStatement(selectquery);
					rs =ps.executeQuery();
					   while(rs.next()) {
						   ap =new AppointmentsDao();
						   
						   ap.setDoc_Id(rs.getInt(1));
						   ap.setName(rs.getString(2));
						   ap.setDate(rs.getDate(3));
						   ap.setSpeciality(rs.getString(4));
						   ap.setCity(rs.getString(5));
						   ap.setNumber(rs.getString(6));
						   ap.setStd_Fees(rs.getFloat(7));
						   ap.setAppoint_Id(rs.getInt(8));
						   ap.setAppoint_Date(rs.getDate(9));
						   ap.setDoctor_id(rs.getInt(10));
						   ap.setPatient_Name(rs.getString(11));
						   ap.setFees_Collected(rs.getString(12));
				          listOfAppointments.add(ap);
				        }
				}catch(SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						rs.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					try {
						ps.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			 return listOfAppointments;
		 }
	 
}
