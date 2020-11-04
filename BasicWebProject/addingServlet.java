package com.keshav;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addingServelet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int a=Integer.parseInt(req.getParameter("one"));
		int b=Integer.parseInt(req.getParameter("two"));
		
		int result=a+b;
		
		PrintWriter out=res.getWriter();
		out.print("RESULT IS -> " + result);
		
		
	}

}
