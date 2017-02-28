package com;

import java.sql.*;

public class connect {
	
    static final String URL="jdbc:mysql://localhost:3306/";
    static final String DATABASE_NAME="ssu";
    static final String USERNAME="ninja";
    static final String PASSWORD="3306";
    
    public static Connection getConnection(){
        Connection C=null;
        System.out.println("Connecting to db.....");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            C=DriverManager.getConnection(URL+DATABASE_NAME,USERNAME,PASSWORD);
            System.out.println("Connection Successful");
            
 
        }catch(Exception e){
            
            System.out.println("Connection Error...");
        }
        
        return C;
    }
}
