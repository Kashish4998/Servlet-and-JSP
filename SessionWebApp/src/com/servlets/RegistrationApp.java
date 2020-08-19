package com.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegistrationApp extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int candidate_id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
	    String id=name+candidate_id;
		HttpSession session =req.getSession();
		session.setAttribute("id",id);
		res.sendRedirect("validate");
		
	}
}
