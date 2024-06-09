package com.add;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;
import com.dao.StudentRecord;

@WebServlet("/students")
public class Students extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		List<StudentRecord> studs= Arrays.asList(new StudentRecord( "Arun", "8928579946", "Mohone,Ambivali (E), Kalyan, Thane", "Mumbai"),
//				new StudentRecord("Mani", "5717887487", "Mohone,Ambivali (E), Kalyan, Thane", "Mumbai"),
//				new StudentRecord( "Sai", "18767788767", "Thane", "Mumbai"),
//		new StudentRecord( "Aniket", "784787687751", "Thane", "Mumbai"));
//		List<StudentRecord> studs= Arrays.asList(new StudentRecord( "Arun", "8928579946", "Mohone,Ambivali (E), Kalyan, Thane", "Mumbai"));
//		StudentRecord record = dao.findByID(523);
		StudentDao dao = new StudentDao();
//		dao.save(student);
		StudentRecord record = dao.findByID(523);
		System.out.println(record);
		List<StudentRecord> studs= Arrays.asList(record);
		req.setAttribute("student", record);
		RequestDispatcher ds = req.getRequestDispatcher("student.jsp");
		ds.forward(req, resp);
	}
}
