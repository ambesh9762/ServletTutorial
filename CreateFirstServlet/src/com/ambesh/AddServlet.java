package com.ambesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class AddServlet extends  HttpServlet 
{
	public void doPost(HttpServletRequest req,HttpServletResponse rep) throws IOException
	{
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		
		int k= i+j;
		
		PrintWriter out=rep.getWriter();
		out.println(" addition is : "+ k);
	}
}
