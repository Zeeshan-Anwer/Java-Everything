package com.trainbooking.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.train.booking.pojo.Train;
import com.train.booking.services.DBTransactions;
import com.train.booking.utils.JdbcUtils;

/**
 * Servlet implementation class UpdateTrain
 */
@WebServlet("/UpdateTrain")
public class UpdateTrain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTrain() {
        super();
        // TODO Auto-generated constructor stub
    }

 @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    

 	PrintWriter out =resp.getWriter();
 	resp.setContentType("text/html");
 	RequestDispatcher rd= req.getRequestDispatcher("adminServices.html");
 	rd.include(req, resp);
    

	 
    String tno=req.getParameter("tno");
    String tname=req.getParameter("tname");
    String tfrom=req.getParameter("tfrom");
    String tto=req.getParameter("tto");
    String tseats=req.getParameter("tseats");
    String tfare=req.getParameter("tfare");
    String tdate=req.getParameter("tdate");

	 String  tid= req.getParameter("id");
	 int id= Integer.parseInt(tid);
 	
 	  out.print("<form action='UpdateServlet2' method='POST'>"); 

 	  out.print("<div class = 'container mt-5' >");
 	   
 		   out.print("<div class='form-group' 'background:rgba(255,255,255,0.4)'>");
 			 out.print("<div class='form-group'>");
 			 out.print("<input type='text' name='tid' value='"+id+"' class='form-control' placeholder=''/>");
 				 out.print("</div>");
 		
 		   out.print("<input type='text' name='tno' value='"+tno+"' class='form-control' background:'transparent' placeholder='Enter Train Number'/>");
 			 out.print("</div>");
 			 out.print("<div class='form-group'>");
 			 out.print("<input type='text' name='tname' value='"+tname+"' class='form-control' placeholder='Enter Train Name'/>");
 				 out.print("</div>");
 				 out.print("<div class='form-group'>");
 					 out.print("<input type='text' name='tfrom' value='"+tfrom+"' class='form-control' placeholder='Enter From Station'/>");
 					 out.print("</div>");
 					 out.print("<div class='form-group'>");
 						 out.print("<input type='text' name='tto' value='"+tto+"' class='form-control' placeholder='Enter To Station'/>");
 						 out.print("</div>");
 			 			 out.print("<div class='form-group'>");
 						   out.print("<input type='text' name='tseats' value='"+tseats+"' class='form-control' placeholder='Enter Seats Available'/>");
 							 out.print("</div>");
 							 out.print("<div class='form-group'>");
 							 out.print("<input type='text' name='tfare' value='"+tfare+"' class='form-control' placeholder='Enter Train Fare'/>");
 							 out.print("</div>");
 							 out.print("<div class='form-group'>");
 							 out.print("<input type='date' name='tdate' value='"+tdate+"' class='form-control' placeholder='Enter Date'/>");
 								 out.print("</div>");
 								 out.print("<div class='form-group'>");
 									 out.print("<input type='submit' name='button' value='Update Train' class='form-control btn btn-primary' />");
 									 out.print("</div>");
 						
 								 
 							 out.print("</div>");
 							 out.print("</form>");
 							 
 	
 								 
 }

}