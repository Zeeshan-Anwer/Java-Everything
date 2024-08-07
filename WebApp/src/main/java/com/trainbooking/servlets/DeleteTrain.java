package com.trainbooking.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.train.booking.services.DBTransactions;

/**
 * Servlet implementation class DeleteTrain
 */
@WebServlet("/DeleteTrain")
public class DeleteTrain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteTrain() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
    	 PrintWriter out= resp.getWriter();
    	 
    	resp.setContentType("text/html");
    	String id =req.getParameter("id");
    	out.print(id);
    	
    	//out.print("<h1> Delete Servlet "+id+"<h1>");
     
       boolean check=DBTransactions.deleteTrainsRecords(Integer.parseInt(id));
     if(check)
     {
    	 RequestDispatcher rd= req.getRequestDispatcher("ViewTrain");
    	 rd.forward(req, resp);
     }
    
     else
     {
    	 out.print("Some error");
     }
    }
}
