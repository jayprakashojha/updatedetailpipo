package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class FetchDataDB {
	    
	public String fetchpunchinput(String Username,String strDatepin)
	{
	    String punchindb = null;	
		Connection con = null;
		{
		try {
			
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "12345");
		String query="select punch_in from punchio1 where phone='"+Username+"'";
	    PreparedStatement stmt = null;
		stmt = con.prepareStatement(query);
		ResultSet rs = null;
		rs = stmt.executeQuery();
		while (rs.next())
   {        
			
			punchindb = rs.getString(1); 
			if(punchindb.equals(strDatepin))
			{
				System.out.println("punch in datetime = " + punchindb);
				return punchindb;
			}
				                          
   }
			rs.close();
		    stmt.close();
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}                     
	    
	  
	    System.out.println("punchin  fetch sucessfully for given mobile......" +punchindb);
	    return punchindb;
	    }
			
	
		
	
	}
}

