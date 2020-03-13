package com.ambesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Division extends HttpServlet {


	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int i= (int) req.getAttribute("i");
		int j= (int) req.getAttribute("j");
		int add=(int) req.getAttribute("add");
		int sub=(int) req.getAttribute("sub");
		int mul= (int) req.getAttribute("mul");
	 	
		int div= i/j;
		
		PrintWriter out= res.getWriter();
		out.println("division is "+ div);
		out.println("calling from 3rd servlet to 4th servlet");
		out.println("multiplication is "+ mul);
		out.println("calling from 2rd servlet to 3rd servlet");
		out.println("substraction is "+ sub);
		out.println("calling from 1st servlet to 2nd servlet");
		out.println("addition is "+ add);
	}
}
