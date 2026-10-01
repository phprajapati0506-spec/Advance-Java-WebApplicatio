package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NighteenServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context=getServletContext();
		
		StudentBean s=(StudentBean)context.getAttribute("student");
		
		if(s == null)
		{
			System.out.println("NineteenServlet service() : Student record are not in ServletContext");	
		}else
		{
			System.out.println("NIneteenServlet service() :" +s.getRno);
		}
	}
}
