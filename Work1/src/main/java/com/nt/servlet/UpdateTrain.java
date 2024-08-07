package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	
        Connection con=JdbcUtils.getConnection();
        System.out.println(con);
        String existingtrainno=req.getParameter("existingtrainNo");
        String tno=req.getParameter("trainNo");
        String tname=req.getParameter("trainName");
        String tfrom=req.getParameter("fromStation");
        String tto=req.getParameter("toStation");
        String tseats=req.getParameter("seatsAvail");
        String tfare=req.getParameter("fare");
        String tdate=req.getParameter("dateofJour");
        
        
        try {
   		PreparedStatement stmt= con.prepareStatement(DBConstants.DB_QUERY_5);
   		
   		stmt.setString(1, tno);
   		stmt.setString(2, tname);
   		stmt.setString(3, tfrom);
   		stmt.setString(4, tto);
   		stmt.setString(5, tseats);
   		stmt.setString(6, tfare);
   		stmt.setString(7, tdate);
   		stmt.setString(8, existingtrainno);
   		
   		stmt.executeUpdate();
   	   PrintWriter out=res.getWriter();
   	    		out.print("Updated Sucessfully");
   	 
   	} catch (SQLException e) {
   		// TODO Auto-generated catch block
   		e.printStackTrace();
   	}

}
}
