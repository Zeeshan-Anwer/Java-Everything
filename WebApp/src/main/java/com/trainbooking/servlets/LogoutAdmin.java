package com.trainbooking.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutAdmin
 */
@WebServlet("/LogoutAdmin")
public class LogoutAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	

    	resp.setContentType("text/html");
    	
	     PrintWriter out= resp.getWriter();
	     HttpSession session= req.getSession();
	      session.invalidate();
	
	      
	      //RequestDispatcher rd=req.getRequestDispatcher("AdminLogin");
	   //rd.include(req, resp);
	}
	
    
}
