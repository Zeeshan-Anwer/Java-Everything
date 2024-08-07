package com.trainbooking.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.train.booking.htmlutil.HtmlUtil;
import com.train.booking.pojo.Train;
import com.train.booking.services.DBTransactions;
import com.train.booking.utils.JdbcUtils;

/**
 * Servlet implementation class insertAdmin
 */
@WebServlet("/insertAdmin")
public class insertAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }


   
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	   PrintWriter out=resp.getWriter();
	   
	   resp.setContentType("text/html");
RequestDispatcher rd= req.getRequestDispatcher("adminServices.html");
rd.include(req, resp);


  out.print(".form-control:focus, .form-control-active { background:transparent; }");
  out.print("<form action='' method='POST'>"); 

  out.print("<div class = 'container mt-5' >");
   
	   out.print("<div class='form-group' 'background:rgba(255,255,255,0.4)'>");
		 out.print("<input type='text' name='trainNo' value='' class='form-control' background:'transparent' placeholder='Enter Train Number'/>");
		 out.print("</div>");
		 out.print("<div class='form-group'>");
		 out.print("<input type='text' name='trainName' value='' class='form-control' placeholder='Enter Train Name'/>");
			 out.print("</div>");
			 out.print("<div class='form-group'>");
				 out.print("<input type='text' name='fromStation' value='' class='form-control' placeholder='Enter From Station'/>");
				 out.print("</div>");
				 out.print("<div class='form-group'>");
					 out.print("<input type='text' name='toStation' value='' class='form-control' placeholder='Enter To Station'/>");
					 out.print("</div>");
					 out.print("<div class='form-group'>");
					   out.print("<input type='text' name='seatsAvail' value='' class='form-control' placeholder='Enter Seats Available'/>");
						 out.print("</div>");
						 out.print("<div class='form-group'>");
						 out.print("<input type='text' name='fare' value='' class='form-control' placeholder='Enter Train Fare'/>");
						 out.print("</div>");
						 out.print("<div class='form-group'>");
						 out.print("<input type='date' name='dateofJour' value='' class='form-control' placeholder='Enter Date'/>");
							 out.print("</div>");
							 out.print("<div class='form-group'>");
								 out.print("<input type='submit' name='button' value='Insert Train' class='form-control btn btn-primary' />");
								 out.print("</div>");
					
							 
						 out.print("</div>");
						 out.print("</form>");
						 
	  String button= req.getParameter("button");
	  out.print(button);
	  if(button!=null)
	  {
     Connection con=JdbcUtils.getConnection();
     System.out.println(con);
     String tno=req.getParameter("trainNo");
     String tname=req.getParameter("trainName");
     String tfrom=req.getParameter("fromStation");
     String tto=req.getParameter("toStation");
     String tseats=req.getParameter("seatsAvail");
     String tfare=req.getParameter("fare");
     String tdate=req.getParameter("dateofJour");
    
     
	Train t = new Train();
	t.setTrainNumber(tno);
	t.setTrainName(tname);
	t.setFromStation(tfrom);   
     t.setToStation(tto);
    
     t.setSeatsAvailable(tseats);
     
     t.setFare(tfare);
t.setDoj(tdate);
	boolean res=DBTransactions.insertTrain(t);
	if(res)
	{
	         String msg= "Data Inserted Suceessfully";
	          double tid=Math.random()+1;
	           
	        String transId= String.valueOf("Trans000145"+tid);
		 out.println("Transaction id:"+transId);
		  out.println(msg);
	 out.print("<span class='btn btn-success'>Record Inserted...</span>");
	}
		
	else
	{
		
		out.print("<div class='container'><span class='btn btn-danger'>Record  not Inserted...</span></div>");
	}

	
}
	
}
}