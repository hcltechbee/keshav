package com.servlet.deletion;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaClass.deletion.DatabaseConnectivity;
import com.javaClass.deletion.DeletionCatcher;
import com.javaClass.deletion.checkExecutionChecker;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@SuppressWarnings("serial")
public class DeleteServlet extends HttpServlet {
	
	public static String nameOfTheUser=null;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		PrintWriter out= response.getWriter(); // creating writer object
		 
		String userName=request.getParameter("user_name");  // extracting username 
		nameOfTheUser=userName;
		checkExecutionChecker check=new checkExecutionChecker();
		int checkExecution=check.settingCheckExecuter(userName);
		
		String messageAfterCheck = DeletionCatcher.checkDeletion(checkExecution);
		if (messageAfterCheck.equals("TASK NOT PERFORMED")) {
			response.sendRedirect("TaskNotPerformed.jsp");
		} else {
			response.sendRedirect("ConfirmToDelete.jsp");
		}
		      
		
//			DatabaseConnectivity getDataBaseConnectivity = new DatabaseConnectivity(); // for database connectivity
//			
//			try {  // performing DB query of deletion
//			PreparedStatement ps=getDataBaseConnectivity.giveConnection().prepareStatement("delete from keshavDB.workers where name=?");  
//            ps.setString(1, userName);
//            checkExecution=ps.executeUpdate();
//			} catch (Exception e) {
//				System.out.println("EXCEPTION");
//			}
			                                        
	}
}
