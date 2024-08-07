package com.nt.servlet;

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

/**
 * Servlet implementation class TrainFetch
 */
@WebServlet("/TrainFetch")
public class TrainFetch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	
	
    
       // System.out.println(con);
	 
//        String FromStation=(req.getParameter("fromStation"));
//        String ToStation=(req.getParameter("toStation"));
//        String Doj=(req.getParameter("dateofTour"));
//        
//        System.out.println("values: "+FromStation+" "+ToStation+" "+Doj);
//        
        int trainNo;
   	     String trainName;
   	     String fromStation;
   	     String toStation;
   	     int seatsAvail;
   	     int fare;
   	     String dateofJourney;
        
   	  PrintWriter out=res.getWriter();
   	res.setContentType("text/html");
   	  System.out.println("W1");
   	     try {
   	    	Connection con=JdbcUtils.getConnection();
   	    System.out.println("W2");
   		Statement stmt= con.createStatement();
   		   
   		ResultSet rs=stmt.executeQuery("SELECT *  FROM TRAIN_DETAILS");
   				//+ " AND TOSTATION='"+ToStation+"' AND  DATEOFJOURNEY='"+Date+"';");
   		System.out.println("Rs"+rs);

   			System.out.println("not null");
   			out.println("</head>\r\n"
   					+ "<body>\r\n"
   					+ "\r\n"
   					+ "<table border=1>\");  \r\n"
   					+ "	<tr>\r\n"
   					+ "	<th>ID</th>\r\n"
   					+ "	<th>Train number</th>\r\n"
   					+ "	<th> TrainName</th>\r\n"
   					+ "	<th> FromStation</th> \r\n"
   					+ "	<th> ToStation</th>\r\n"
   					+ "	<th> Seats Available</th>\r\n"
   					+ "	<th> Fare</th>   \r\n"
   					+ "	<th> </th>\r\n"
   					+ "	<th> <a href='www.google.come'>Update</a> </th>\r\n"
   					+ "	<th> <a href='www.google.come'>Delete</a> </th>\r\n"
   					+ "	\r\n"
   					+ "	</tr>	\r\n"
   					+ "</table>\r\n"
   					+ "</body>");
   			
   		while(rs.next()) {
   			System.out.println("Rs"+rs);
   			
   			trainNo=rs.getInt(1);
   			trainName=rs.getString(2);
   			fromStation=rs.getString(3);
   			toStation=rs.getString(4);
   			seatsAvail=rs.getInt(5);
   			fare=rs.getInt(6);
   			dateofJourney=rs.getString(7);
   			
   			
   			out.println("</head>\r\n"
   					+ "<body>\r\n"
   					+ "\r\n"
   					+ "<table border=1>\");  \r\n"
   					+ "	<tr>\r\n"+trainNo+"</th><th>"+ trainName+"</th><th>"+ fromStation+"</th> <th>"+toStation+"</th> <th>"+seatsAvail+"</th><th>"+fare+ "<th> </th>\r\n"
   					+ "	<th> <a href='www.google.come'>Update</a> </th>\r\n"
   					+ "	<th> <a href='www.google.come'>Delete</a> </th>\r\n"
   					+ "	\r\n"
   					+ "	</tr>	\r\n"
   					+ "</table>\r\n"
   					+ "</body>");
   			out.println();
   		}
   		
   		out.println("<html>  <body><table border=2><tr><td rowspan=2><h1>Train Name</h1></td><td rowspan=2><h1>Starting place</h1></td><td rowspan=2><h1>Destination Place</h1></td><td rowspan=2><h1>Fare</h1></td>
   		//<td colspan=2><h1><center>Time</center></h1></td>

   		</tr>"
   		<tr>
   		<td>Arrival</td>
   		<td>Departure</td>

   		</tr>
   		<tr>
   		<td>kamayani exp</td>
   		<td>Dadar_varanasi</td>
   		<td>1500 km.</td>
   		<td>5000 Rs.</td>
   		<td>12:00pm<br>28-08-2010</td>
   		<td>2:00pm<br>30-08-2010</td>
   		</tr>
   		<tr>
   		<td>Dacken exp</td>
   		<td>Mumbai_pune</td>
   		<td>300 km.</td>
   		<td>50 Rs.</td>
   		<td>3:00pm</td>
   		<td>7:00pm</td>
   		</tr>
   		<tr>
   		<td>Lonawala exp</td>
   		<td>pune_lonawala</td>
   		<td>150 km.</td>
   		<td>25 Rs.</td>
   		<td>12:00pm</td>
   		<td>1:30pm</td>
   		</tr>
   		<tr>
   		<td>CHANAY exp</td>
   		<td>Dadar_chanay</td>
   		<td>1500 km.</td>
   		<td>5000 Rs.</td>
   		<td>12:00pm<br>28-08-2010</td>
   		<td>2:00pm<br>30-08-2010</td>
   		</tr>
   		<tr>
   		<td>kamayani exp</td>
   		<td>Varanasi_dadar</td>
   		<td>1500 km.</td>
   		<td>5000 Rs.</td>
   		<td>12:00pm<br>28-08-2010</td>
   		<td>2:00pm<br>30-08-2010</td>
   		</tr>
   		<tr>
   		<td>Pawan exp</td>
   		<td>Dadar_patna</td>
   		<td>1500 km.</td>
   		<td>5000 Rs.</td>
   		<td>12:00pm<br>28-08-2010</td>
   		<td>2:00pm<br>30-08-2010</td>
   		</tr>
   		</table>
   		</body>
   		</html>
   	  
   	  
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
