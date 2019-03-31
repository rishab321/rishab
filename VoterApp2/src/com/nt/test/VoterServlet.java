//VoterServlet.java
package com.nt.test;

import javax.servlet.*;
import javax.servlet.http.*;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import java.io.*;

public class VoterServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		String name=null, tage=null;
		int age=0;
		//general settings
		pw=res.getWriter();
		res.setContentType("text/html");
		//get request parameter values(form data)
		name=req.getParameter("pname");
		tage=req.getParameter("page");
		age=Integer.parseInt(tage);
		
		//write business logic for request processing logic
		if(age>=18)
		{
			pw.println("<h1 style='color:green;text-align:center'>Mr/Mrs/Miss"+name+"You are eligible for Vote</h1>");
		}
		else{
			pw.println("<h1 style='color:red;text-align:center'>Mr/Mrs/Miss"+name+"You are not eligible for Vote You need Wait +(18-age)+years"+"</h1>");
		}
		//add graphical hyperlink
		pw.println("<br><a href='input.html'><img src='home1.png'></a>");
		//close stream
		pw.close();
	}
	
	
	

}
