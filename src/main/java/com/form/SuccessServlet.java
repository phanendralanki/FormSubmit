package com.form;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class SuccessServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("This is success");
		out.println("<h2>Successful</h2>");
	}
}
