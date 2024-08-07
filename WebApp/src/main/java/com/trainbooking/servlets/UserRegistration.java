package com.trainbooking.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserRegistration
 */
@WebServlet(name = "UserRegistrationServlet", urlPatterns = { "/UserRegistrationServlet" })
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
PrintWriter out= resp.getWriter();
out.print("<html>");
out.print("<title> User Registeration</title>");
out.print("<h1>User Registeration </h1>");
out.print("<body> <form action='register'> ");
out.print("<table>");
out.print("<tr><td>First Name:</td><td><input type=text name=firstname></td></tr>");
out.print("<tr><td>Last Name:</td><td><input type=text name=lastname></td></tr>");
out.print("<tr><td>Date of Birth:</td><td><input type=date name=dob></td></tr>");
out.print("<tr><td>City:</td><td><input type=text name=city></td></tr>");
out.print("<tr><td>State:</td><td><input type=text name=state></td></tr>");
out.print("<tr><td>Pincode:</td><td><input type=text name=pincode></td></tr>");
out.print("<tr><td>Address 1:</td><td><input type=text name=ad1></td></tr>");
out.print("<tr><td>Address 2:</td><td><input type=text name=ad2></td></tr>");
out.print("<tr><td>Landmark:</td><td><input type=text name=landmark></td></tr>");
out.print("<tr><td>Street:</td><td><input type=text name=street></td></tr>");
out.print("<tr><td>Country:</td><td><input type=text name=country></td></tr>");
out.print("<tr><td>Mobile:</td><td><input type=text name=mobile></td></tr>");
out.print("<tr><td>Alternate Mobile:</td><td><input type=text name=mobile2></td></tr>");
out.print("<tr><td><input type=\"submit\" align=\"center\" value=\"Register\" ></td></tr>");
out.print("</table>");
out.print("</form>");
out.print("</body></html>");


}
}
