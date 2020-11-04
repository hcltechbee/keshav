package com.javaClass.deletion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class checkExecutionChecker {
	
	DatabaseConnectivity getConnectionToCheckUserName = new DatabaseConnectivity();
	List<String> listOfUserNames = new ArrayList<>(); 
	int checkExecute=0;
	
	public int settingCheckExecuter(String nameOfUser) {
			try {  // performing DB query of deletion
				Statement Executer=getConnectionToCheckUserName.giveConnection().createStatement(); 
	            ResultSet nameGenerator = Executer.executeQuery("Select * from keshavdb.workers");
	            while (nameGenerator.next()) {
	            	String name= nameGenerator.getString(2);
	            	listOfUserNames.add(name);
	            }
				} catch (Exception e) {
					System.out.println("EXCEPTION");
				}
			
			listOfUserNames.forEach(user -> { if(user.equals(nameOfUser)) checkExecute=1; } ) ;
			return checkExecute;
	
		}
}

