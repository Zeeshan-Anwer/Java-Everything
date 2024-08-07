package com.trainbooking.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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

import com.mysql.cj.xdevapi.Statement;
import com.train.booking.htmlutil.HtmlUtil;
import com.train.booking.utils.JdbcUtils;

/**
 * Servlet implementation class FindTrain
 */
@WebServlet("/FindTrain")
public class FindTrain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindTrain() {
        super();
        // TODO Auto-generated constructor stub
    }

@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out= resp.getWriter();
	 
	String print= HtmlUtil.converter("D:\\Workspace\\WebApp\\src\\main\\webapp\\findTrain.html");
	 out.print(print);
	boolean check=false;
	Connection con=JdbcUtils.getConnection();
	
	
	 HttpSession session=req.getSession();
		
	 int t= session.getMaxInactiveInterval();
	   String name=(String)session.getAttribute("username");
	   out.print(t);
	   out.print(name);
	   if(session.getAttribute("username")==null)
	   {
             resp.sendRedirect("UserLogin");
             
		   //RequestDispatcher rd= req.getRequestDispatcher("UserLogin");		  
             // rd.forward(req, resp);
	   }
	   else
	   {
		   String msg="Welcome "+name;
	          out.print("<h1 style='color:white' > " +msg+  "</h1>");		         

	   }
	
  String tsource= req.getParameter("Source");
  String tdest= req.getParameter("Destination");
  String tdate= req.getParameter("Date");
  String Query="SELECT * FROM TRAIN_DETAILS WHERE FROMSTATION=? AND TOSTATION=?" ;
 String Query2="SELECT * FROM TRAIN_DETAILS"; 
  resp.setContentType("text/html");  
 out.println("<html><body>");  
  try {
	      java.sql.Statement pst= con.createStatement();
	       pst.execute(Query2);
	      
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
          
	       
				//out.println(rs.getInt(1)+"\t"+rs.gAAAAAAAAAAAA						etString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+" \t "+rs.getInt(6)+" \t "+rs.getInt(7));
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
  
	
}

}
