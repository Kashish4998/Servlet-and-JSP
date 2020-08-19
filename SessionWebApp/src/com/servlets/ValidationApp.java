package com.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;

public class ValidationApp extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		HttpSession session=req.getSession();
		PrintWriter out =res.getWriter();
		String id=(String)session.getAttribute("id");
		if(id.matches("[a-zA-Z]*[0-9]*"))
			out.println("REGISTERED");
		else
			out.print("INVALID DETAILS");
			
	}
}
