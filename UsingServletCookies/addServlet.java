package com.servlet.working;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class addServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		int numberOne=Integer.parseInt(request.getParameter("one"));
		int numberTwo=Integer.parseInt(request.getParameter("two"));
		
		int sumValue=numberOne + numberTwo;

		Cookie cookie=new Cookie("result", sumValue+"");
		response.addCookie(cookie);
		
		response.sendRedirect("squraing");		
	
	}

}
