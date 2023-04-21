package com.form;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class RegisterServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		//we are getting two objects i.e request,response(we can generate dynamic response)
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("Welcome to Register Servlet");
		
		String name = request.getParameter("user_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_course");
		
		String cond = request.getParameter("condition");
//		out.println(cond);
		
		if(cond!=null) {
		
		if(cond.equals("checked")) {
//			out.println("<h2> name:" +name+ "</h2>");
//			out.println("<h2> password:" +password+ "</h2>");
//			out.println("<h2> email:" +email+ "</h2>");
//			out.println("<h2> gender:" +gender+ "</h2>");
//			out.println("<h2> course:" +course+ "</h2>");
			
			//JDBC
			
			//RequestDispatcher 
//			if we want to forward after successful registration
			RequestDispatcher rd = request.getRequestDispatcher("SuccessServlet");
			rd.forward(request, response);
			
			
		}
		}
		else {
			out.println("<h2>You have not accepted terms and conditions</h2>");
			//RequestDispatcher 
			//I want to include output of index.html 
			
			//get the object of RequestDispatcher 
			
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			
			//include 
			rd.include(request, response);
		}
	}

}
