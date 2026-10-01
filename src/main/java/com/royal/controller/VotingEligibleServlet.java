package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

	@WebServlet("/VotingServlet")

	public class VotingEligibleServlet extends HttpServlet {

	    protected void doPost(HttpServletRequest request,
	                           HttpServletResponse response)
	            throws ServletException, IOException {

	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        try {

	            String name = request.getParameter("voterName");
	            int age = Integer.parseInt(request.getParameter("age"));
	            String gender = request.getParameter("gender");
	            String city = request.getParameter("city");

	            if (age < 0 || age > 120) {

	                throw new InvalidAgeException(
	                    "Invalid Age: Age cannot be less than 0 or greater than 120."
	                );
	            }

	            out.println("<html><body>");

	            out.println("<h2>Voting Eligibility Result</h2>");
	            out.println("Name: " + name + "<br>");
	            out.println("Age: " + age + "<br>");
	            out.println("Gender: " + gender + "<br>");
	            out.println("City: " + city + "<br><br>");

	            if (age >= 18) {

	                out.println("<h3> "+name+"you are eligible for voting.</h3>");

	            } else {

	                out.println("<font color='red'>"+name+" , you are not eligible for voting.</font>");

	                out.println("<font color='red'>"+name+" ,You must be at least 18 years old.</font>");
	            }

	            out.println("</body></html>");

	        } catch (InvalidAgeException e) {

	            out.println("<h2>" + e.getMessage() + "</h2>");

	        } catch (NumberFormatException e) {

	            out.println("<h2>Please enter a valid age.</h2>");

	        } catch (Exception e) {

	            out.println("<h2>Something went wrong.</h2>");
	        }
	    }
	}


	// Custom Exception
	class InvalidAgeException extends Exception 
	{

	    public InvalidAgeException(String message) {
	        super(message);
	    }
	}


