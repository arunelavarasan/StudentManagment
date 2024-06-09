package com.add;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("get method called");
		req.getParameter("user");
		req.getParameter("password");
//		HttpSession session = req.getSession();
//		session.setAttribute("phoneno", "4545234524");
//		session.setAttribute("address", "Mohone");
		Cookie cookie = new Cookie("phoneno", "8928946");
		resp.addCookie(cookie);
		resp.addCookie(new Cookie("address", "Mohone"));
		System.out.println("Dispatcher serlvet..");
		resp.sendRedirect("/StudentMangement/result");
	}
}
