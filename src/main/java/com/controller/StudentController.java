package com.controller;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.dao.StudentDao;
import com.dao.StudentRecord;

public class StudentController {
	
	public static void main(String[] args) {
//		StudentRecord student = new StudentRecord(523,"mani", "4938002808", "thane", "mumbai");
		StudentDao dao = new StudentDao();
//		dao.save(student);
		StudentRecord record = dao.findByID(523);
		System.out.println(record);
	}
}


















//try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","sys as sysdba","pass");
//			System.out.println(con);
//			PreparedStatement pstmt = con.prepareStatement("select sysdate from dual");
//			ResultSet rs = pstmt.executeQuery();
//			rs.next();
//			System.out.println(rs.getString(1));
//			con.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}