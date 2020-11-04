package com.classes.users;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsersDataBase {
	public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/keshavdb","root","Keshav@2313");  
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
	
	 public static List<Users> getAllEmployees(){  
	        List<Users> list=new ArrayList<>();  
	        
	try{  
        Connection con=UsersDataBase.getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from user905");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Users e=new Users();  
            e.setId(rs.getInt(1));  
            e.setName(rs.getString(2));  
            e.setPassword(rs.getString(3));  
            e.setEmail(rs.getString(4));  
            e.setCountry(rs.getString(5));  
            list.add(e);  
        }  
        con.close();  
    }catch(Exception e){e.printStackTrace();}  
      
    return list;  
	 }  

	 
	  public static int deleteUser(int id){  
	        int status=0;  
	        try{  
	            Connection con=UsersDataBase.getConnection();  
	            PreparedStatement ps=con.prepareStatement("delete from user905 where id=?");  
	            ps.setInt(1,id);  
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return status;  
	    }  

}
