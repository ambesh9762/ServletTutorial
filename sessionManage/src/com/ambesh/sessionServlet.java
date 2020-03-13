package com.ambesh;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class sessionServlet extends HttpServlet 
{
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession session= req.getSession();
		
		String uname=(String) req.getParameter("uname");
		String pass=(String) req.getParameter("pass");
		
		session.setAttribute("uname",uname);
		session.setAttribute("pass", pass);
		
		if(uname=="ambesh" && pass=="1234")
			res.sendRedirect("next");
		else
			res.sendRedirect("sessionManage");
		
	}
		
}


