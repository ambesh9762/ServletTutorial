package com.ambesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int k= Integer.parseInt(req.getParameter("k"));
		
		PrintWriter out= res.getWriter();
		out.println("addition is "+k);
	}
}
