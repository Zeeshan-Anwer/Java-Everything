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
import com.train.booking.pojo.Profile;
import com.train.booking.services.DBTransactions;

/**
 * Servlet implementation class UserLogin
 */
@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLogin() {
        super();
        // TODO Auto-generated constructor stub
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {       PrintWriter out= resp.getWriter();
    
   String p=  HtmlUtil.converter("D:\\Workspace\\WebApp\\src\\main\\webapp\\userLogin.html");
    out.print(p);
    	Profile profile= new Profile();
    	
    	resp.setContentType("text/html");
    	
    	String username=req.getParameter("username");
    	String password=req.getParameter("password");
    	
    	profile.setUserName(username);
    	profile.setPassword(password);
    	HttpSession session=null;
    	if(username.isEmpty()|| password.isEmpty())
    	{
    		  
    	  out.println("<h1 style=color:red text-align:center> You Have Not Entered Anything </h1>");	
    	  RequestDispatcher rd= req.getRequestDispatcher("userLogin.html");
    	  rd.include(req, resp);
      
    	}
    	
    	else if(DBTransactions.verufyUserCredentials(profile)==true)
      {
    		 out.print("login Success");
       	  RequestDispatcher rd= req.getRequestDispatcher("UserServices");
          session=req.getSession();
     	   session.setMaxInactiveInterval(20);
     	   session.setAttribute("username", req.getParameter("username"));
  	  
       	  rd.forward(req, resp);
    	   
      }
   
      
    		
    		
    

    }
    


}
