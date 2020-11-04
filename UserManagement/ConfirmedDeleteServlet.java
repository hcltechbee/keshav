package com.servlet.deletion;

import java.io.IOException;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaClass.deletion.DatabaseConnectivity;

@SuppressWarnings("serial")
public class ConfirmedDeleteServlet extends HttpServlet {
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException
	{	
		DeleteServlet d=new DeleteServlet();
		String namedUser=d.nameOfTheUser;
		
		int checkExecutioned=0;
		System.out.println(namedUser);
		DatabaseConnectivity getDataBaseConnectivity = new DatabaseConnectivity(); // for database connectivity
		
		try {  // performing DB query of deletion
		PreparedStatement ps=getDataBaseConnectivity.giveConnection().prepareStatement("delete from keshavDB.workers where name=?");  
        ps.setString(1, namedUser);
        checkExecutioned=ps.executeUpdate();
        System.out.println("update executed");
		} catch (Exception e) {
			System.out.println("EXCEPTION");
		}
		
		if(checkExecutioned==1)
			response.sendRedirect("deleted.jsp");
		else	
			response.sendRedirect("TaskNotPerformed.jsp");
	}
}
