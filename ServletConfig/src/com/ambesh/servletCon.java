package com.ambesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletCon extends HttpServlet 
{
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		ServletConfig sc= getServletConfig();
		String name =sc.getInitParameter("name");
		
		PrintWriter out = res.getWriter();
		out.println("hi"+ name);
	}
}
