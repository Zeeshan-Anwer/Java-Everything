package com.train.user.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.train.booking.utils.JdbcUtils;
import com.train.user.pojo.Train;

/**
 * Servlet implementation class FindTrainDetails
 */
@WebServlet("/FindTrain")
public class Show_All_Train_Details extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Show_All_Train_Details() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	 protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	    	
		 	Train T1=new Train();
	    
	       // System.out.println(con);
		 
	        T1.setFromStation(req.getParameter("fromStation"));
	        T1.setToStation(req.getParameter("toStation"));
	        T1.setDoj(req.getParameter("dateofTour"));
	        
	        System.out.println("values: "+T1.getFromStation()+" "+T1.getToStation()+" "+T1.getDoj());
	        
	        int trainNo;
	   	     String trainName;
	   	     String fromStation;
	   	     String toStation;
	   	     int seatsAvail;
	   	     int fare;
	   	     String dateofJourney;
	        
	   	  PrintWriter out=res.getWriter();
	   	  
	   	     try {
	   	    	Connection con=JdbcUtils.getConnection();
	   	    
	   		Statement stmt= con.createStatement();
	   		
	   
	   		   
	   		ResultSet rs=stmt.executeQuery("SELECT *  FROM TRAIN_DETAILS WHERE FROMSTATION='"+T1.getFromStation()+"' AND TOSTATION='"+T1.getToStation()+"'");
	   				//+ " AND TOSTATION='"+ToStation+"' AND  DATEOFJOURNEY='"+Date+"';");
	   		System.out.println("Rs"+rs);

	   			System.out.println("not null");
	   		while(rs.next()) {
	   			System.out.println("Rs"+rs);
	   			
	   			trainNo=rs.getInt(1);
	   			trainName=rs.getString(2);
	   			fromStation=rs.getString(3);
	   			toStation=rs.getString(4);
	   			seatsAvail=rs.getInt(5);
	   			fare=rs.getInt(6);
	   			dateofJourney=rs.getString(7);
	   			
	   			out.println("<h1 style='color:red;text-align:center'>Train Name "+"\t\tFrom Station "+"\t\tTo Station "+"\t\tAvailable Seats"+"\t\tFare "+"\t\t Date");
	   			out.print("<h1 style='color:blue;text-align:center'>"+trainName+"\t\t"+fromStation+"\t\t"+toStation+"\t\t"+seatsAvail+"\t\t"+fare+"\t\t"+dateofJourney);
	   			
	   		}
	   	  
	   	  
	   	   stmt.close();
	   	  rs.close();
	   		
	   	  
	   	} catch (SQLException e) {
	   		// TODO Auto-generated catch block
	   		e.printStackTrace();
	   	}

	   	     
//Not fully implemented
}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
}
