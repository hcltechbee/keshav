package com.servlet.working;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class squareServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		//int sumValue= Integer.parseInt(req.getParameter("sumValue"));
		
//		HttpSession session=req.getSession();	
//		int sumValue=(int) session.getAttribute("result");
		
		int sumValue = 0;
		Cookie cokies[]=req.getCookies();
		
		
		for(Cookie iterate: cokies)
		{
			if(iterate.getName().equals("result"))
				sumValue=Integer.parseInt(iterate.getValue());
		}
		
		int product=sumValue*sumValue;
		
		PrintWriter out=res.getWriter();
		out.println("SQUARE OF YOUR SUM IS :- "+product);
	}

}
