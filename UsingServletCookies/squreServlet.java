package com.servlet.working;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class squreServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		
		int numberToSquare =0;
		Cookie cokies[]=request.getCookies();
		
		
		for(Cookie iterate: cokies)
		{
			if(iterate.getName().equals("result"))
				numberToSquare=Integer.parseInt(iterate.getValue());
		}
		int squareValue= numberToSquare*numberToSquare;
		
		PrintWriter out=response.getWriter();
		out.println("SQUARE OF SUMMED NUMBERS IS:- "+squareValue);	
	}
}
