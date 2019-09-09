package com.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deleteservlet")
public class deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String msg=null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("text/html");
		String email=request.getParameter("email");
		String password=request.getParameter("password");

		daoimpl up=new daoimpl();
		boolean b=up.delete(email, password);
		
		
		if(b==true) {
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.forward(request, response);
		}
		else {
			msg="invalid login Password";
			request.setAttribute("true", msg);
			RequestDispatcher rd=request.getRequestDispatcher("home.html");
			rd.include(request, response);
		}
		
		
	}

}
