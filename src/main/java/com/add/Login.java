package com.add;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = (String)request.getParameter("username");
		String pass = (String)request.getParameter("pass");
		System.out.println(name + "  "+pass);
		HttpSession session = request.getSession();
		if(name.equals("arun@gmail.com") && pass.equals("root")) {
			session.setAttribute("user", name);
			System.out.println("redirected");
			Cookie cook = new Cookie("msg","");
			response.addCookie(cook);
			response.sendRedirect("/StudentMangement/students"); //students
		} else {
			Cookie cook = new Cookie("msg","invalid");
			response.addCookie(cook);
//			Cookie cookie = new Cookie("phoneno", "8928946");
//			response.addCookie(cookie);
//			response.addCookie(new Cookie("address", "Mohone"));
			response.sendRedirect("/StudentMangement/login.jsp");
		}
	}

}
