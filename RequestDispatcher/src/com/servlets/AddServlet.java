package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		  
		//this will not work
		  int n1=Integer.parseInt(req.getParameter("num1")); int
		  n2=Integer.parseInt(req.getParameter("num2")); PrintWriter
		  out=res.getWriter(); int k=(n1+n2); out.println("ADDITION RESULT="+k);
		 
	  RequestDispatcher rd=req.getRequestDispatcher("sq");
	  rd.forward(req, res);
}
}
