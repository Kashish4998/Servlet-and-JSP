package com.app;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class AddServlet extends HttpServlet
{
  public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	  int n1=Integer.parseInt(req.getParameter("num1"));
	  int n2=Integer.parseInt(req.getParameter("num2"));
	  PrintWriter out=res.getWriter();
	  out.println("RESULT="+(n1+n2));
  }
}
