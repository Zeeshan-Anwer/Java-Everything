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
 * Servlet implementation class DeleteTrain
 */
@WebServlet( "/DeleteTrain" )
public class DeleteTrain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteTrain() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	
        Connection con=JdbcUtils.getConnection();
        System.out.println(con);
        int tno=Integer.parseInt(req.getParameter("trainNo"));
        
        try {
   		PreparedStatement stmt= con.prepareStatement(DBConstants.DB_QUERY_4);
   		stmt.setInt(1, tno);
   		   boolean check=stmt.execute();
   	   PrintWriter out=res.getWriter();

   		out.print("Deleted Suceessfully");
   	
   	} catch (SQLException e) {
   		// TODO Auto-generated catch block
   		e.printStackTrace();
   	}

    }
}
	

