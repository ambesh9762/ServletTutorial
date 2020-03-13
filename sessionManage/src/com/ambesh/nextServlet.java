package com.ambesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class nextServlet extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		HttpSession session = req.getSession();
		 
		String uname=(String) session.getAttribute("uname");
		
		PrintWriter out= res.getWriter();
		out.println("welcome"+ uname);
	}

}
