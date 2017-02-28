package com;

import java.sql.*;

public class loginDAO {

	public static int validate(loginBean RB)
	{
		int status=0;
		
		try{
			Connection C = connect.getConnection();
			PreparedStatement P= C.prepareStatement("select * from login where EMAIL=? and PASSWD=?");
			
			P.setString(1,RB.getEmail());
			P.setString(2,RB.getPassword());
			
			ResultSet R=P.executeQuery();
			
			
			while(R.next())
			{
				
				System.out.println("successful select....."+R.getString("Fname"));
				status=1;
			
			}
			if(status==0)
			System.out.println("query error or user not found.....");
		}
		catch(Exception e)
		{
			System.out.println("loginDAO ...");
			e.printStackTrace();
		}
		
		
		return status;
	}
	
}
