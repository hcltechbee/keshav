package com.servlet.working;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class addServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int a=Integer.parseInt(req.getParameter("one"));
		int b=Integer.parseInt(req.getParameter("second"));
		
		int result=a+b;
		
//		PrintWriter out=res.getWriter();
//		out.println("YOUR SUMMES VALUES IS :- "+result);
		int value=result;
//		req.setAttribute("sum", value);
//		
//		RequestDispatcher rs=req.getRequestDispatcher("SQUARING");
//		rs.forward(req, res);
		
//		HttpSession session=req.getSession();
//		session.setAttribute("result", value);
		
		Cookie cookie=new Cookie("result", value+"");
		res.addCookie(cookie);
		
		
		
		//res.sendRedirect("SQUARING?sumValue="+result);
		res.sendRedirect("SQUARING");
	}

}
