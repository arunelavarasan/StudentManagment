package com.add;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession session = request.getSession();
		Long phoneno = null;
		String address = null;
		Cookie cookies[] = request.getCookies();
		for(Cookie cookie : cookies) {
			if(cookie.getName().endsWith("phoneno")) {
			     phoneno = Long.parseLong((String) cookie.getValue());
			}
			if(cookie.getName().endsWith("address")) {
			   address = (String)cookie.getValue();
			}
		}
		
		
		
		
		try(PrintWriter out = response.getWriter();){
			out.print("phoneno : "+phoneno+"\nphoneno :"+address);
		}
	}

}
