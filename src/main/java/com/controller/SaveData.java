package com.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;
import com.dao.StudentRecord;

@WebServlet("/save")
public class SaveData extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname= req.getParameter("uname");
		String phoneno= req.getParameter("phoneno");
		String addharid= req.getParameter("addharid");
		String add= req.getParameter("add");
		String uni= req.getParameter("uni");
		String brach= req.getParameter("branch");
		String cgpa= req.getParameter("cgpa");
		System.out.println("got save request");
//		String = req.getParameter("");
		Random ran = new Random();
		StudentRecord record = new StudentRecord(uname,phoneno,addharid,add,uni,brach,"7.54 cgpa");
		record.setId(ran.nextInt(10000));
		StudentDao dao = new StudentDao();
		dao.save(record);
		System.out.println("saved success!");
		resp.sendRedirect("student.jsp");
	}
}
