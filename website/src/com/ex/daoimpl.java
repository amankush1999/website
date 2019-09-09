package com.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class daoimpl implements dao
{
  private Connection conn;
  private PreparedStatement ps;
  private int res;
  
  boolean bo=false;
  
  
	@Override
	public boolean signup(user u)
	{
		try {
			conn=connectionProvider.getconnection();
			ps=conn.prepareStatement("insert into signup values(?,?,?,?,?)");
     		ps.setString(1,u.getFirstname());
     		ps.setString(2,u.getLastname());
     		ps.setString(3,u.getPassword());
     		ps.setLong(4,u.getPhoneNo());
     		ps.setString(5,u.getEmail());
     		
     		res=ps.executeUpdate();
     		if(res>0)
     		{
     			bo=true;
     		}
     		
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("Error in dao");
			
		}
		return bo;
		
		
	}
	
	{
		
		
		
	}

	@Override
	public boolean login(user u1) {
		
		boolean b=false;
		try {
			conn=connectionProvider.getconnection();
			ps=conn.prepareStatement("select from signup where email=? and password=?");
			
			ps.setString(1,u1.getEmail());
			ps.setString(2,u1.getPassword());
			ResultSet res=ps.executeQuery();
			
			if(res.next()) 
			{
				b=true;
			}
			
		    }catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return b;
	}

	@Override
	public boolean update(user u2) {
		boolean b=false;
		try {
			conn=connectionProvider.getconnection();
			ps=conn.prepareStatement("update signup SET firstname=?, lastname=?, password=?, phoneNo=? where email=?");
			ps.setString(1,u2.getFirstname());
			ps.setString(2,u2.getLastname());
			ps.setString(3,u2.getPassword());
			ps.setLong(4,u2.getPhoneNo());
			ps.setString(5,u2.getEmail());
			
			res=ps.executeUpdate();
			if(res>0)
			{
				b=true;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return b;
	}

	@Override
	public boolean delete(String email, String password) {
		boolean b=false;
		
		try {
			conn=connectionProvider.getconnection();
			ps=conn.prepareStatement("delete from signup where email=? and password=?");
			
			ps.setString(1,email);
			ps.setString(2,password);
	        res=ps.executeUpdate();
	        
	        if(res>0) {
	        	
	        	b=true;
	       
	        }
	        
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return b;
	}

	
	
	}

	
	
	

