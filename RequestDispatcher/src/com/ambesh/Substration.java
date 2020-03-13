package com.ambesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Substration extends HttpServlet 
{
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int i=(int) req.getAttribute("i");
		int j=(int) req.getAttribute("j");
		
		int add=(int) req.getAttribute("add");
		PrintWriter out= res.getWriter();
		out.println("calling 1st servelt to 2nd servlet");
		out.println("addition is : "+add);
		
		int sub= i-j; 
		req.setAttribute("sub", sub);
		
		RequestDispatcher rd= req.getRequestDispatcher("multi");
		rd.forward(req, res);
		
	}
}
