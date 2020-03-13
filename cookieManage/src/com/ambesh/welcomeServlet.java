package com.ambesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class welcomeServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String uname = null;
		Cookie cookie[]=req.getCookies();
		for(Cookie c:cookie) 
		{
			if(c.getName().equals("uname"))
				 uname =c.getValue();
		}
		PrintWriter out= res.getWriter();
		out.println("welcome "+ uname);
	}
}
