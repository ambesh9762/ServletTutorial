package com.ambesh;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Addition extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		 int i=Integer.parseInt(req.getParameter("num1"));
		 int j=Integer.parseInt(req.getParameter("num2"));
		 
		 int add=i+j;
		 
		 req.setAttribute("i", i);
		 req.setAttribute("j", j);
		 req.setAttribute("add", add);
		 
		 RequestDispatcher rd = req.getRequestDispatcher("subs");
		 rd.forward(req, res);
		 
	}
}
