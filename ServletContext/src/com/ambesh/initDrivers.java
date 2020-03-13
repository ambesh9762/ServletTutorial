package com.ambesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class initDrivers extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		ServletContext ctx = req.getServletContext();
		String dname=(String) ctx.getInitParameter("driversName");
		PrintWriter out= res.getWriter();
		out.println("my database connection drivers name is: " +dname);
		
	}

}
