package com.ex;

import java.sql.Connection;

import java.sql.DriverManager;

public class connectionProvider
{
  static Connection conn=null;
   
 
  public static Connection getconnection() 
  {
	  try
	  {
	     Class.forName("org.h2.Driver"); 
		conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","root","");
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	  
	  
	return conn;
	  
  }
  
}
