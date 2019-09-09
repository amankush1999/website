package com.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updateservlet")
public class updateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private dao d;
	String msg=null;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("text/html");
		 String firstname=request.getParameter("firstname");
		 String lastname=request.getParameter("lastname");
		 String password=request.getParameter("password");
	     Long phoneNo=Long.parseLong(request.getParameter("phoneNo"));
	     String email=request.getParameter("email");
	     
	     user u= new user();
		   u.setFirstname(firstname);
		   u.setLastname(lastname);
		   u.setPassword(password);
		   u.setPhoneNo(phoneNo);
		   u.setEmail(email);
		   
		   
		   d= new daoimpl();
		   boolean b=d.update(u);
		   
		   if(b==true) {
			   RequestDispatcher rd=request.getRequestDispatcher("home.html");
			   rd.forward(request, response);
			   
			  
		   }else {
			   
				msg="error";
				request.setAttribute("true", msg);
				RequestDispatcher rd=request.getRequestDispatcher("home.html");
				rd.include(request, response);
		   }
		
	}

}
