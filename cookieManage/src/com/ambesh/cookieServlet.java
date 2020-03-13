package com.ambesh;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cookieServlet extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String uname= req.getParameter("uname");
		String pass=req.getParameter("pass");
		
		Cookie cookie = new Cookie("uname", uname);
		res.addCookie(cookie);
		
		res.sendRedirect("welcome");
	}

}
