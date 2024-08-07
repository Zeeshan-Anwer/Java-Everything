package com.train.user.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.train.booking.utils.JdbcUtils;

import htmlConvertor.HtmlConvertor;

/**
 * Servlet implementation class FindTrain
 */
@WebServlet("/FindTrain")
public class Admin_Services extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin_Services() {
        super();
        // TODO Auto-generated constructor stub
    }

@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out= resp.getWriter();
	 
	//Show All Train 
	
	boolean check=false;
	Connection con=JdbcUtils.getConnection();
	
  String tsource= req.getParameter("Source");
  String tdest= req.getParameter("Destination");
  String tdate= req.getParameter("Date");
  String Query="SELECT * FROM TRAIN_DETAILS WHERE FROMSTATION=? AND TOSTATION=?" ;
  resp.setContentType("text/html");  
  out.println("<html><body>");  
  try {
	PreparedStatement pstmt=con.prepareStatement(Query);
	 pstmt.setString(1, tsource);
	 pstmt.setString(2, tdest);
	 
		ResultSet rs=pstmt.executeQuery();
		out.println("<table border=1 width=50% height=50%>");  
        out.println("<tr><th>ID</th><th>Train number</th><th> TrainName</th><th> FromStation</th> <th> ToStation</th> <th> Seats Available</th><th> Fare</th>   <tr>");
		while(rs.next())
		{
		if(tsource.equals(rs.getString("FROMSTATION")) && tdest.equals(rs.getString("TOSTATION"))==true )
		{
	       check=true;		
			//out.print("Id "+"TrainNumber "+"TrainName "+"FromStation "+"ToStation "+"SeatsAvailable "+"Fare");
				
	       int id = rs.getInt(1);  
           String tno = rs.getString(2);  
           String  tname= rs.getString(3);
             String from=rs.getString(4);
           String to=rs.getString(5);
            int seats=rs.getInt(6);
           int d=rs.getInt(7);
          
	       
				//out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+" \t "+rs.getInt(6)+" \t "+rs.getInt(7));
		        // out.println("--------------------------------------------------------");
        	         out.println("<tr><td>" + id + "</td><td>" + tno + "</td><td>" + tname + "</td><td>" + from + "</td><td>" + to + "</td> <td>" + d + "</td>  </tr>");   
          
                 
		}	
		else if(check==false)
		{
			out.print("No Train found");
		}
		
		} 
		out.println("</table>");  
        out.println("</html></body>");  
		
		    
		
		
		
		
  
  }
  catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
  //Insert Train Service
  
  
  
 // Connection con=JdbcUtils.getConnection();
  System.out.println(con);
  String tno=req.getParameter("trainNo");
  String tname=req.getParameter("trainName");
  String tfrom=req.getParameter("fromStation");
  String tto=req.getParameter("toStation");
  String tseats=req.getParameter("seatsAvail");
  String tfare=req.getParameter("fare");
  String ttdate=req.getParameter("dateofJour");
  //	public static final String INSERT_QUERY_TRAINDETAILS=
//	"insert into train_details(TRAINNUMBER,TRAINNAME,FROMSTATION,TOSTATION,SEATSAVAILABLE,FARE,DATEOFJOURNEY)values(?,?,?,?,?,?,?);";

  
  try {
		PreparedStatement stmt= con.prepareStatement(DBConstants.INSERT_QUERY_TRAINDETAILS);
			    
		stmt.setString(1, tno);
		stmt.setString(2, tname);
		stmt.setString(3, tfrom);
		stmt.setString(4, tto);
		stmt.setString(5, tseats);
		stmt.setString(6, tfare);
		stmt.setString(7, ttdate);
		
		stmt.execute();

		out.print("Inserted Suceessfully");
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

  
//  //Update Train Service
//  
//  System.out.println(con);
//  String existingtrainno=req.getParameter("existingtrainNo");
//  String tno=req.getParameter("trainNo");
//  String tname=req.getParameter("trainName");
//  String tfrom=req.getParameter("fromStation");
//  String tto=req.getParameter("toStation");
//  String tseats=req.getParameter("seatsAvail");
//  String tfare=req.getParameter("fare");
//  String tdate=req.getParameter("dateofJour");
//  
////  public static final String UPDATE_QUERY="UPDATE TRAIN_DETAILS SET TRAINNUMBER=?,TRAINNAME=?,FROMSTATION=?,TOSTATION=?,SEATSAVAILABLE=?,FARE=?,DATEOFJOURNEY=? WHERE TRAINNUMBER=?" ;
//
//  try {
//		PreparedStatement stmt= con.prepareStatement(DBConstants.UPDATE_QUERY);
//		
//		stmt.setString(1, tno);
//		stmt.setString(2, tname);
//		stmt.setString(3, tfrom);
//		stmt.setString(4, tto);
//		stmt.setString(5, tseats);
//		stmt.setString(6, tfare);
//		stmt.setString(7, tdate);
//		stmt.setString(8, existingtrainno);
//		
//		stmt.executeUpdate();
//
//	    		out.print("Updated Sucessfully");
//	 
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//
//
//  //Delete Train Service
//  
//  Connection con=JdbcUtils.getConnection();
//  System.out.println(con);
//  int tno=Integer.parseInt(req.getParameter("trainNo"));
//  
//  try {
//		PreparedStatement stmt= con.prepareStatement(DBConstants.DELETE_QUERY);
//		stmt.setInt(1, tno);
//		   boolean check=stmt.execute();
//	   PrintWriter out=res.getWriter();
//
//		out.print("Deleted Suceessfully");
//	
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
}

}
