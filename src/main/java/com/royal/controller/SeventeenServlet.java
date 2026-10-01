package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SeventeenServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext applicationScope = getServletContext();
		
		StudentBean sbean=new StudentBean(1,"Ankur",10,100);
		
		applicationScope.setAttribute("student", sbean);
		
		System.out.println("SeventeenServlet : service()");
		
	}
}
