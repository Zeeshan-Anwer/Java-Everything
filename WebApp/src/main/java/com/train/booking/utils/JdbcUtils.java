package com.train.booking.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.train.booking.jdbc.connection.DBDetails;
import com.train.booking.utils.PropertyUtil;

public class JdbcUtils {

	public static Connection getConnection()
	{
		Connection con=null;
		DBDetails db=PropertyUtil.getCredentials();
		try 
		{
	   Class.forName("com.mysql.cj.jdbc.Driver");
		 con=DriverManager.getConnection(db.getUrl(),db.getuserName(),db.getPassword());
		 //System.out.println(con);
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
