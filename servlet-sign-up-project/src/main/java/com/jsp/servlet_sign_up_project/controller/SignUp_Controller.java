package com.jsp.servlet_sign_up_project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SignUp_Controller implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter printWriter= res.getWriter();
		String name= req.getParameter("user_name");
		String password= req.getParameter("user_password");
		String email= req.getParameter("user_email");
		String gender= req.getParameter("user_gender");
		String course= req.getParameter("user_course");
		String check= req.getParameter("user_checked");
		
		
		System.out.println(name);
		System.out.println(password);
		System.out.println(email);
		System.out.println(gender);
		System.out.println(course);
		System.out.println(check);
		
		
		
//		printWriter.println(name);
//		printWriter.println(password);
//		printWriter.println(email);
//		printWriter.println(gender);
//		printWriter.println(course);
//		printWriter.println(check);
		
		
		  printWriter.write("<html>");
		  printWriter.write("<body>");
			/* printWriter.write("<h2>name"+name+"</h2>"); */ 
		  printWriter.write("<h2>"+name+"</h2>");
		  printWriter.write("<h2>password</h2>");
		  printWriter.write("<h2>email</h2>"); 
		  printWriter.write("<h2>course</h2>");
		  printWriter.write("<h2>check</h2>");
		  printWriter.write("</body>");
		  printWriter.write("</html>");
		 
		
		
		RequestDispatcher dispatcher= req.getRequestDispatcher("signUp.jsp");
		dispatcher.include(req, res);
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
	

}
