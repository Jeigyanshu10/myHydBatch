package com.te.mynewservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//
//@WebServlet(description = "My first servlet", urlPatterns = { "/firstservletpath" }, initParams = {
//		@WebInitParam(name = "defaultUser", value = "JeigyanshuKumarSarangi") })
public class FirstServlet extends HttpServlet {

	public int add(int a, int b) {
		return a + b;
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.setContentType("text/html");
//		PrintWriter illiaz = response.getWriter();
//		String userName = request.getParameter("username");
//		String password = request.getParameter("password");
//		String profession = request.getParameter("profession");
//		String[] location = request.getParameterValues("location");
//		illiaz.println("Hello " + userName + " from GET... We know your password, it is " + password
//				+ ". We also know you work as a professional : " + profession + ". Below are your work locations:");
//		for (int i = 0; i < location.length; i++) {
//			illiaz.println(location[i]);
//		}
//		System.out.println("Hi Jeigyanshu");

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("This is a test");
		writer.println("<br>");
		writer.println("The value of the sum of 5 & 6 is : " + add(5, 6));

		writer.println("<h2>Hello Hyderabad!!!</h2>");

//		String userName = request.getParameter("username");
//
//		HttpSession session = request.getSession();
//		ServletContext context = request.getServletContext();
//
//		if (userName != "" && userName != null) {
//			session.setAttribute("savedUserName", userName);
//			context.setAttribute("savedUserName", userName);
//		}
//
//		writer.println("Request object has username as:  " + userName);
//		writer.println("Session object has username as:  " + session.getAttribute("savedUserName"));
//		writer.println("Servlet Context object has username as:  " + context.getAttribute("savedUserName"));
//		writer.println(
//				"Config context object has username as: " + this.getServletConfig().getInitParameter("defaultUser"));

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String userName = request.getParameter("username");

		HttpSession session = request.getSession();

		writer.println("Request object has username as:  " + userName);
		writer.println("Session object has username as:  " + (String) session.getAttribute("savedUserName"));

	}

}
