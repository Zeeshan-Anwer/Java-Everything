package com.train.user.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.train.booking.utils.JdbcUtils;
import com.train.user.pojo.NewRegister;


@WebServlet("/UserForm")
public class User_Registration_Form extends HttpServlet {
private static final long serialVersionUID = 1L;



/**
* @see HttpServlet#HttpServlet()
*/
public User_Registration_Form() {
super();
// TODO Auto-generated constructor stub
}





/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
	PrintWriter p=response.getWriter();
	int iage=0;
	p.println("<a href='HomePage.html'> HomePage</a>");


	NewRegister u= new NewRegister();
	
	
	u.setUsername(request.getParameter("userName"));
	u.setFirstname(request.getParameter("firstName"));
	u.setSecondname(request.getParameter("secondName"));
	u.setMiddleName(request.getParameter("MiddleName"));
	u.setAddressLine1(request.getParameter("addr1"));
	u.setAddressLine2(request.getParameter("addr2"));
	u.setAddressLine3(request.getParameter("addr3"));
	u.setAge(request.getParameter("age"));
	u.setCity(request.getParameter("city"));
	u.setState(request.getParameter("state"));
	u.setCountry(request.getParameter("country"));
	u.setPincode(request.getParameter("pincode"));
	u.setPassword(request.getParameter("password"));

	List<String> ErrorList=new ArrayList();
	
	if(u.getUsername()==" "|| u.getUsername()==null || u.getUsername().length()==0)
		ErrorList.add("Name should not blank");
	
	if(u.getAddressLine1()==" " || u.getAddressLine1()==null || u.getAddressLine1().length()==0)
		ErrorList.add("Address Line 1 required");
	
	if(u.getFirstname()==" " || u.getFirstname()==null || u.getFirstname().length()==0)
		ErrorList.add("First Name is required");
	
	if(u.getAge()==null ||u.getAge()==" " || u.getAge().length()==0)
		ErrorList.add("Age required");
	
	else {
		 try {
			 iage=Integer.parseInt(u.getAge());
			 if(iage<=18 || iage>110)
				 ErrorList.add("Person age must be in the range of 1 through 110");  // age range rule
		 }
		 catch(NumberFormatException nfe) {
			 ErrorList.add("Person  age must be numberic value");  //  age must be numeric value 
		 }
	 }//else
	
	
	if(ErrorList.size()>0) {
		 p.println(" <ul style='color:red'>");
		 for(String errMsg:ErrorList)
			 p.println("<li>"+ errMsg+"</li>");
		 p.println("</ul>");
		 return ;  //block control going further
	 }
	
	
	Connection con=null;
	try {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=JdbcUtils.getConnection();
	PreparedStatement stmt=con.prepareStatement(DBConstants.INSERT_QUERY_USER);
	
	stmt.setString(1, u.getUsername());
	stmt.setString(2, u.getFirstname());
	stmt.setString(3, u.getSecondname());
	stmt.setString(4, u.getMiddleName());
	stmt.setString(5, u.getAddressLine1());
	stmt.setString(6, u.getAddressLine2());
	stmt.setString(7, u.getAddressLine3());
	stmt.setString(8, u.getCity());
	stmt.setString(9, u.getState());
	stmt.setString(10, u.getCountry());
	stmt.setString(11, u.getPincode());
	stmt.setString(12, u.getPassword());
	stmt.setString(13, u.getAge());
	
	stmt.execute();

	
	} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

	 catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	
	p.println("<h1 style='color:Green;text-align:center'>Successfully Registered With these details:-</h1>");
	
	p.println("username =" +u.getUsername());
	p.println("FirstName =" +u.getFirstname());
	p.println("MiddleName =" +u.getMiddleName());
	p.println("Lastname =" +u.getSecondname());
	p.println("AddrLine1 =" +u.getAddressLine1());
	p.println("AddrLine2 =" +u.getAddressLine2());
	p.println("AddrLine3 =" +u.getAddressLine3());
	p.println("Age =" +u.getAge());
	p.println("State =" +u.getState());
	p.println("City =" +u.getCity());
	p.println("Country =" +u.getCountry());
	p.println("pincode =" +u.getPincode());
	p.println("password =" +u.getPassword());
	
	}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}

}