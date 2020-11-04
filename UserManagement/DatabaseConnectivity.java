package com.javaClass.deletion;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnectivity {
	
	public Connection giveConnection() {
		Connection connection=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/keshavdb","root","Keshav@2313");
		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
	}

}
