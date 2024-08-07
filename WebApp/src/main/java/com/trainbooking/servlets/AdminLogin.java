package com.trainbooking.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.Statement;
import com.train.booking.htmlutil.HtmlUtil;
import com.train.booking.jdbc.connection.ConnectionToDatabase;
import com.train.booking.utils.JdbcUtils;



/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

    
  @Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
  {
		 PrintWriter out=res.getWriter();
			
		 String adminLogin=HtmlUtil.converter("D:\\Workspace\\WebApp\\src\\main\\webapp\\admin.html");
		  out.print(adminLogin);
	  
	  
			/*
			 * try {
			 * 
			 * Class.forName("com.mysql.cj.jdbc.Driver"); } catch (ClassNotFoundException
			 * e1) { // TODO Auto-generated catch block e1.printStackTrace(); }
			 * 
			 */	try {
	
				 Connection con=JdbcUtils.getConnection();
					
			System.out.println(con);
		 String name=req.getParameter("adminName");
			String pass=req.getParameter("adminPassword");
			PreparedStatement stmt= con.prepareStatement("SELECT * FROM ADMIN_LOGIN WHERE ADMINNAME=? AND ADMINPASSWORD=?");
			
			 stmt.setString(1, name);
			  stmt.setString(2, pass);
			 ResultSet  rs=stmt.executeQuery();
			 res.setContentType("text/html");
			
			while(rs.next())
			{
			 if(rs.getString("adminName").equals(name)&&rs.getString("adminPassword").equals(pass))
			 {
			      
			 	 out.print("login Success");
				 out.print(name);
				  
			 	 RequestDispatcher rd=req.getRequestDispatcher("AdminServices");

			 	 HttpSession session=req.getSession();
		     	   session.setMaxInactiveInterval(20);
		     	   session.setAttribute("adminName", req.getParameter("adminName"));
		  		 
				 		rd.forward(req, res);
				    
			  
			 }
			 else
			
			 {
			    	
		RequestDispatcher rd=req.getRequestDispatcher("AdminLogin");
		out.println("<h1 style=color:red text-align:center> Wrong Credentials </h1>");
		
		rd.include(req, res);
	
		
			 }
			  
	
	}}
	
	catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	 
	
    
  }
  
  
}
