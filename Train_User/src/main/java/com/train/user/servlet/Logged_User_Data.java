package com.train.user.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import htmlConvertor.HtmlConvertor;



/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/userLogin")
public class Logged_User_Data extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Logged_User_Data() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    

    
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	  res.setContentType("text/html");
	  PrintWriter p=res.getWriter();
	  try { //try1
		 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	} //try1
	  catch (ClassNotFoundException e1) { //catch1 
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}//catch1
	 
	try { //try2 
		boolean status=false;
		Connection	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/train_booking_system","root","zeeshan");
		System.out.println(con);
		 String name=req.getParameter("userName");
			String pass=req.getParameter("userPassword");
			PreparedStatement stmt= con.prepareStatement("SELECT * FROM USER_DETAILS WHERE USERNAME=? AND PASSWORD=?");
			
			 stmt.setString(1, name);
			  stmt.setString(2, pass);
			 ResultSet  set=stmt.executeQuery();
	
			 if(set.next()) 
				 status=true;
			 
		    	   if(status) { //if1
		    		   p.println("Welcome! You are sucessfully Logged In");
			   	    	 
			   		ResultSet rs=stmt.executeQuery("SELECT *  FROM TRAIN_DETAILS");
			   		p.println("<h1 style='color:red;text-align:center'>Train Name "+"\t\tFrom Station "+"\t\tTo Station "+"\t\tAvailable Seats"+"\t\tFare "+"\t\t Date");
			 
			   		while(rs.next()) { //while1
			   			
			   			int trainNo=rs.getInt(1);
			   			String trainName=rs.getString(2);
			   			String fromStation=rs.getString(3);
			   			String ToStation=rs.getString(4);
			   			int seatsAvail=rs.getInt(5);
			   			int fare=rs.getInt(6);
			   			String dateofJourney=rs.getString(7);
			   			
			   			
			   			p.print("<h1 style='color:blue;text-align:center'>"+trainName+"\t\t"+fromStation+"\t\t"+ToStation+"\t\t"+seatsAvail+"\t\t"+fare+"\t\t"+dateofJourney+"</h1>");
			   						   			
			   		 
				   		
			   		}//while1
			   		
			   		stmt.close();
				   	rs.close();
				   	
				   	
				   	String result=HtmlConvertor.convertor("D:\\Workspace\\Train_User\\src\\main\\webapp\\BookTicket_Login.html");
				 

//				   	p.print(result);
//				    p.println("Book Your Ticket Below");
//			   		p.println("<table>");
//
//		   			p.println("<tr>  <td> From Station</td> <td><input type='text' name='fromStation'/> </td> </tr>");
//		   			p.println("<tr>  <td> To Station</td> <td><input type='text' name='toStation'/> </td> </tr>");
//
//		   			p.println("<tr>  <td> Date</td> <td><input type='date' name='dateofTour'/> </td> </tr>");
//
//		   			p.println("<tr><td><input type='submit' align='center' value='Book' ></td></tr>");
//
//		   			p.println("</table>");

		    	   }//if1
			   	  
		    	   else
		    		   p.println("INVALID CREDENTIALS");
  	  
			   	}//try2
					catch (SQLException e) { //catch2
			   		// TODO Auto-generated catch block
			   		e.printStackTrace();
			   	}//catch2
  	    	   
		    	  
		      }
			

    
  
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	doGet(req, resp);
}
  
  
}
