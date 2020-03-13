package com.ambesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Multiplication extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int i= (int) req.getAttribute("i");
		int j=(int) req.getAttribute("j");
		int add=(int) req.getAttribute("add");
		int sub= (int) req.getAttribute("sub");
		
		PrintWriter out= res.getWriter();
		out.println("calling 2nd servlet to 3rd servlet");
		out.println("addition is "+add);
		out.println("substration is "+ sub);
		
		int mul=i*j;
		req.setAttribute("mul", mul);
		
		RequestDispatcher rd= req.getRequestDispatcher("divi");
		rd.forward(req, res);
	}

}
