package com.trainbooking.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

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
 * Servlet implementation class UpdateServlet2
 */
@WebServlet("/UpdateServlet2")
public class UpdateServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

 @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
 {

	 
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

		 String  tid= req.getParameter("tid");

		 int id= Integer.parseInt(tid);

		 String button= req.getParameter("button");
		  out.print(button);

		  if(button!=null)
		  {
	     Connection con=JdbcUtils.getConnection();
	     System.out.println(con);
	 	
		Train t = new Train();
		t.setTrainNumber(tno);
		t.setTrainName(tname);
		t.setFromStation(tfrom);   
	     t.setToStation(tto);
	    
	     t.setSeatsAvailable(tseats);
	     
	     t.setFare(tfare);
	     t.setDoj(tdate);
	   
	     t.setId(id); 
	     
int res=DBTransactions.updateTrainsRecords(t);
System.out.println("update "+res);
		System.out.println(res);
		
		if(res>0)
			{
		         
		 out.print("<span class='btn btn-success'>Record Updated...</span>");
		 rd= req.getRequestDispatcher("ViewTrain");
    	rd. forward(req, resp);

		}
			
		else
		{
			
			out.print("<div class='container'><span class='btn btn-danger'>Record  not Updated...</span></div>");
		}

		
	}
		
	}

		 
 }



