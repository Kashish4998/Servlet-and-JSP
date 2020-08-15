package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int n1=Integer.parseInt(req.getParameter("num1"));
		  int n2=Integer.parseInt(req.getParameter("num2"));
		  PrintWriter out=res.getWriter();
		  int k=(n1*n2);
		  out.println("SQUARE IS "+k);
	}

}
