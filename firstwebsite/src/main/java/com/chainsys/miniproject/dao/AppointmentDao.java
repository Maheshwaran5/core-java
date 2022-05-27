package com.chainsys.miniproject.dao;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.chainsys.miniproject.pojo.Appointment;

public class AppointmentDao {

	public static Connection getConnection() {
		Connection mycon = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "mahesh365";

		try {
			Class.forName(driver);
			mycon = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mycon;
	}

	private static java.sql.Date convertToSql(java.util.Date date) {
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		return sqlDate;

	}

	public static int insertAppointment(Appointment newapp) {

		Connection mycon = getConnection();
		PreparedStatement stmt = null;
		String insertquery = "insert into APPOINTMENTS( APP_ID,APP_DATE, DOC_ID,PATIENT_NAME,FEES_COLLECTED) values(?,?,?,?,?)";

		int rows = 0;
		try {
			stmt = mycon.prepareStatement(insertquery);
			stmt.setInt(1, newapp.getApp_id());
			stmt.setDate(2, convertToSql(newapp.getApp_date()));
			stmt.setInt(3, newapp.getDoc_id());
			stmt.setString(4, newapp.getPatient_name());
			stmt.setFloat(5, newapp.getFees_collected());

			rows = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				mycon.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return rows;
	}

	public static int updateAppointment(Appointment newapp) {
		String updatequery = "update doctor set APP_DATE=?, DOC_ID=?,PATIENT_NAME=?,FEES_COLLECTED=? where APP_DATE=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setInt(5, newapp.getApp_id());
			ps.setDate(1, convertToSql(newapp.getApp_date()));
			ps.setInt(2, newapp.getDoc_id());
			// convert java.util.Date to java.sql.date
			ps.setString(3, newapp.getPatient_name());
			ps.setFloat(4, newapp.getFees_collected());

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

	public static int updatePatientName(int id, String name) {
		String updatequery = "update APPOINTMENTS set PATIENT_NAME=? where APP_ID=? ";
		Connection con = null;
		int rows = 0;
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

	public static int updateDateOfAppointment(int id, Date date) {
		String updatequery = "update APPOINTMENTS set APP_DATE? where APP_ID=? ";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setDate(1, convertToSql(date));
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

	public static int deleteAppointment(int id) {
		String deletequery = "delete from APPOINTMENTS where APP_ID=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;

		try {
			con = getConnection();
			ps = con.prepareStatement(deletequery);
			ps.setInt(1, id);

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

	public static Appointment getAppointmentById(int id) {
		Appointment app = null;
		String selectquery = " select  APP_ID,APP_DATE, DOC_ID,PATIENT_NAME,FEES_COLLECTED from APPOINTMENTS where APP_ID= ? ";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			app = new Appointment();
			if (rs.next()) {
				app.setApp_id(rs.getInt(1));
				java.util.Date date = new java.util.Date(rs.getDate(2).getTime());
				app.setApp_date(date);
				app.setDoc_id(rs.getInt(3));
				app.setPatient_name(rs.getString(4));
				app.setFees_collected(rs.getInt(5));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
		return app;

	}

	public static List<Appointment> getAllAppointments() {
		Appointment app = null;
		String selectquery = " select APP_ID,APP_DATE, DOC_ID,PATIENT_NAME,FEES_COLLECTED from APPOINTMENTS";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Appointment> allAppointments = new ArrayList();
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			rs = ps.executeQuery();
			while (rs.next()) {
				app = new Appointment();
				app.setApp_id(rs.getInt(1));
				java.util.Date date = new java.util.Date(rs.getDate(2).getTime());
				app.setApp_date(date);
				app.setDoc_id(rs.getInt(3));
				app.setPatient_name(rs.getString(4));
				app.setFees_collected(rs.getInt(5));
				allAppointments.add(app);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
		return allAppointments;

	}

	public static int updateAppointmentsCollectedFee(int id, int collectedFee) {
		String updatequery = "update APPOINTMENTS set COLLECTED_fees=? where APP_ID=? ";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setInt(1, collectedFee);
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

}
