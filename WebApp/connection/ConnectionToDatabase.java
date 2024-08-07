package com.train.booking.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class ConnectionToDatabase {

	public static void main(String[] args) {
		
	try 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_train","root","root");
	 System.out.println(con);
	} 
	catch (ClassNotFoundException e)
	{

		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
