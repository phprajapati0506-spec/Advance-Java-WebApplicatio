package com.royal.controller;
//java.util.Scanner;
import java.io.IOException;

import java.io.PrintWriter;
import java.util.Scanner;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Table2Servlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//MIME -- Multipurpose Mail Extension
		response.setContentType("text/html");
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
				
        PrintWriter out = response.getWriter();
        
        for (int i = 1; i <= 10; i++) 
        {
            out.println(num + " * " + i + " = " + (num * i)+"<br>");
        }
	}
}
