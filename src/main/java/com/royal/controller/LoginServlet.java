package com.royal.controller;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{		
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	System.out.println("=======doGet()-- Login Servlet =============");
		
		String useremail = request.getParameter("useremail"); 
		
		String password=request.getParameter("password");
		
		Enumeration<String> e=request.getHeaderNames();

		while(e.hasMoreElements())
		{
			String nameStr=e.nextElement();
			String nameValue =request.getParameter(nameStr);
			
			System.out.println(nameStr + "---" + nameValue);
		}
		
		System.out.println("useremail :" + useremail);
		System.out.println("password : "+ password);
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		System.out.println("=======doPost()-- Login Servlet ======");
		
		doGet(request,response);
	}
}
//		if(useremail .equals("user123@gmail.com") && password.equals("user@123"))
//		{
//			System.out.println("Welcome , My Page... ");
//		}
//		else
//		{
//			System.out.println("UserName and Password doesn't matched..!!!");
//		}
		


