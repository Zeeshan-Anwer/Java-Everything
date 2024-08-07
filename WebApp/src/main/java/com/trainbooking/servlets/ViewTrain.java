package com.trainbooking.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.train.booking.pojo.Train;
import com.train.booking.services.DBTransactions;

/**
 * Servlet implementation class ViewTrain
 */
@WebServlet("/ViewTrain")
public class ViewTrain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewTrain() {
        super();
        // TODO Auto-generated constructor stub
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    
    	PrintWriter out =resp.getWriter();
    	resp.setContentType("text/html");
    	RequestDispatcher rd= req.getRequestDispatcher("adminServices.html");
    	rd.include(req, resp);

    		
    	 List<Train> list=DBTransactions.getAllTrainsRecords();    	
    	
    	 out.println("<div class='container'><table class= 'table mt-5 table-bordered table-light'>");
    	 out.println("<div><tr class='bg-primary'><th scope='col'>ID</th><th scope='col'>Train Number</th><th scope='col'>Train Name</th><th scope='col'>From Station</th><th scope='col'>To Station</th><th scope='col'>Seats Available</th><th scope='col'>Fare</th><th scope='col'>Date</th><th scope='col'>Update</th><th scope='col'>Delete</th></tr></div>");
    
  for( Train train:list)
   {
        int tid=train.getId();
	  String tno=train.getTrainNumber();
	   String tname=train.getTrainName();
	   String tfrom=train.getFromStation();
	   String tto=train.getToStation();
	   String tseats=train.getSeatsAvailable();
	   String tfare=train.getFare();
	   String tdate=train.getDoj();
	   
	   out.println("<tr scope='row'>");
	   out.println("<td>"+tid+"</td>");
	   
	   out.println("<td>"+tno+"</td>");
	   out.println("<td>"+tname+"</td>");
	   out.println("<td>"+tfrom+"</td>");
	   out.println("<td>"+tto+"</td>");
	   out.println("<td>"+tseats+"</td>");
	   out.println("<td>"+tfare+"</td>");
	   out.println("<td>"+tdate+"</td>");
	    
	  out.println("<td><a href='UpdateTrain?id="+tid+"&tno="+tno+"&tname="+tname+"&tfrom="+tfrom+"&tto="+tto+"&tseats="+tseats+"&tfare="+tfare+"&tdate="+tdate+"'<span class='btn btn-success'></span> Update </a></td>"); 
	  out.println("<td><a href='DeleteTrain?id="+tid+"'<span class='btn btn-danger'></span> Delete </a></td>"); 
	  
	   
	   
	   out.println("</tr>");
	   
   }
    
      out.println("</table></div>");
    }
     
}

