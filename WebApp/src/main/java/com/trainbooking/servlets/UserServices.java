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

import com.train.booking.htmlutil.HtmlUtil;
import com.train.booking.utils.JdbcUtils;

/**
 * Servlet implementation class UserServices
 */
@WebServlet("/UserServices")
public class UserServices extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServices() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		 PrintWriter out= resp.getWriter();
		
		 String print= HtmlUtil.converter("D:\\Workspace\\WebApp\\src\\main\\webapp\\userServices.html");
		 out.print(print);
	 	 HttpSession session=req.getSession();
	
	 	  session.getMaxInactiveInterval();
	 	   String name=(String)session.getAttribute("username");
	 	   if(name==null)
	 	   {
	 		   
	 		   out.println("<h1 style=color:red text-align:center> Session Has Expired </h1>");
		     	  RequestDispatcher rd= req.getRequestDispatcher("userLogin.html");
		     	  rd.include(req, resp);
	 	     
	 	   }
	 	   else
	 	   {
	 		
	 		  String msg="Welcome "+name;
              out.print("<h1 style='color:white' > " +msg+  "</h1>");		         

	     	
	 	   
	 	   }
	}

	
}