package com;

import java.sql.*;

public class registerDAO {
	public static int validate(registerBean RB)
	{
		int status=0;
		
		try{
			Connection C = connect.getConnection();
			PreparedStatement P= C.prepareStatement("insert into login(FNAME,LNAME,EMAIL,PASSWD) values (?,?,?,?);");
			
			P.setString(1,RB.getFname());
			P.setString(2,RB.getLname());
			P.setString(3,RB.getEmail());
			P.setString(4,RB.getPassword());
			
			status=P.executeUpdate();
			
		}
		catch(Exception e)
		{
			
			System.out.println("registerDAO ...");
			e.printStackTrace();
		}
		
		
		return status;
	}
}
