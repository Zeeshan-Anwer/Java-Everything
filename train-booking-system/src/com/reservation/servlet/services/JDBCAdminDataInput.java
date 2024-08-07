package com.reservation.servlet.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JDBCAdminDataInput extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// get PrintWriter
		PrintWriter pw=res.getWriter();
		//set response conten type
		res.setContentType("text/html");
		//read form form data  (req parameter vlaues)
		int TrainNo=Integer.parseInt(req.getParameter("TrainNo"));
		String TrainName=(req.getParameter("TrainName"));
		String FromStation=req.getParameter("FromStation");
		String ToStation=req.getParameter("ToStation");
		int Seats=Integer.parseInt(req.getParameter("Seats"));
		int FareAmount=Integer.parseInt(req.getParameter("FareAmount"));
		//write b.logic (request procesing logic)
		/* if(age<18)
			 pw.println("<h1 style='color:red;text-align:center'>Mr/Miss/Mirss."+name+"   U r not elgible for Corona Vaccination </h1>");
		 else
			 pw.println("<h1 style='color:green;text-align:center'>Mr/Miss/Mirss."+name+"   U r  elgible for Corona Vaccination, Make it happen </h1>");
		 
		 //add home hyerlink (graphical  hyperlink)
		 pw.println("<a href='crnaurl'> <img src='images/home1.png'> </a>");
		 */
		 //close stream
		 pw.close();
	}//doGet(-,-)

}//class
