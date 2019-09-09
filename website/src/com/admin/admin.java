package com.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/admin")
public class admin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		response.setContentType("text/html");
	
		String st=request.getParameter("name");
		String pass=request.getParameter("password");
		
		if(st.equals("admin")&& pass.equals("aman123"))
		{
			response.sendRedirect("product.jsp");
			return;
		
		}else {
			response.sendRedirect("index.html");
			System.out.println("error");
			
		}
	}

}
