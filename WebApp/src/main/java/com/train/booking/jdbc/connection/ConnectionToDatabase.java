package com.train.booking.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class ConnectionToDatabase {

	public static Connection getConnection()
	{

		Connection con=null;
		try 
		{
		 Class.forName("com.mysql.cj.jdbc.Driver");
		  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/train_booking_system","root","zeeshan");
		 System.out.println(con);
		} 
		catch (ClassNotFoundException e)
		{

			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
		
	}

