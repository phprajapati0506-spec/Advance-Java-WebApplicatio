package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DiamondServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		List<String> list = List.of("Baby Pink","Pink","Rose Pink","Coral Pink","Red","Orange","Apricot Orange","Yellow","Apple Green","Leaf Green","Green","Turquoise Green","Light Blue","Sky Blue","Aqua Blue","Blue","Blue Black","Violet","Grape","Dark Red","Olive","Mint Green","Chocolate Brown","Charcoal Grey");
		
		int m=0;
		
		PrintWriter out=response.getWriter();
		
		for(int i=1;i<=5;i++)
		{
			for(int k=(5-1);k>=1;k--)
			{
				out.print(" &nbsp");
				m++;
			}
			for(int j=1; j<=i;j++)
			{
				out.print("<font color='>"+ list.get(m)+"'>*&nbsp</font>");
				m++;
			}
			out.print("<br>");
		}
		for(int i=4;i>=1;i--)
		{
			for(int k=(5-i);k>=1;k--)
			{
				out.print("&nbsp");
			}
			for(int j=1;j<=i;j++)
			{
				out.print("<font color='"+list.get(m)+"'>8&nbsp</font>");
				m++;
			}
			out.print("<br>");
		}
		
	}
}
