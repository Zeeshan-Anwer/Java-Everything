package com.train.booking.utils.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.train.StringConstant.StringConstant;
import com.train.booking.pojo.Train;

public class TrainAllService {

public static void insertTrain(Train train)
{
	//Getting connection  
			Connection con=JdbcUtils.getConnection();
			
			try {
					   //Preparing Query 2 which are present in the DBConstant Class
				PreparedStatement stmt=con.prepareStatement(DBConstants.DB_QUERY_2);
						  
				
							stmt.setInt(1, train.getTrainNumber());
							stmt.setString(2, train.getTrainName());
							stmt.setString(3, train.getFromStation());
							stmt.setString(4, train.getToStation());
							stmt.setInt(5, train.getSeatsAvailable());
							stmt.setInt(6, train.getFare());
							System.out.println(StringConstant.INSERTED);
							
							stmt.execute();
							
				   } catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

}

public static void viewAllTrain()
{
	Train train=new Train();
	Connection con=JdbcUtils.getConnection();
	try {
		PreparedStatement stmt=con.prepareStatement(DBConstants.DB_QUERY_3);
		ResultSet rs=stmt.executeQuery();
	 
		while(rs.next())
	   	
		{
			 System.out.println();
				
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+" \t "+rs.getInt(6)+" \t "+rs.getInt(7));
	         System.out.println("--------------------------------------------------------"); 
	     }
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	    

}

public static void deleteTrain(int id)
{
	Connection con=JdbcUtils.getConnection();
	try {
		PreparedStatement stmt=con.prepareStatement(DBConstants.DB_QUERY_4);
		stmt.setInt(1, id);
		stmt.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
public static boolean findTrainByTrainNumber(int trainnumber)
{
	boolean check=false;
	Connection con=JdbcUtils.getConnection();
	try {
		PreparedStatement stmt=con.prepareStatement(DBConstants.DB_QUERY_6);
      stmt.setInt(1, trainnumber);
		ResultSet rs=stmt.executeQuery();
		 
		while(rs.next())
	   	
		{if(trainnumber==rs.getInt("TRAINNUMBER"))
		{
			check=true;
			 System.out.println(StringConstant.DATA_SHOW);
				
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+" \t "+rs.getInt(6)+" \t "+rs.getInt(7));
	         System.out.println("--------------------------------------------------------"); 
		}
		}

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return check;
	
}
public static void updateTrain(Train train)
{
	Connection con=JdbcUtils.getConnection();

	try {
		PreparedStatement stmt=con.prepareStatement(DBConstants.DB_QUERY_5);
		
		stmt.setInt(7, train.getTrainNumber());
		stmt.setInt(1, train.getTrainNumber());
		stmt.setString(2, train.getTrainName());
		stmt.setString(3, train.getFromStation());
		stmt.setString(4, train.getToStation());
		stmt.setInt(5, train.getSeatsAvailable());
		stmt.setInt(6, train.getFare());
		stmt.executeUpdate();
		System.out.println(StringConstant.UPDATED);

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  

}
public static boolean searchTrainBetweenStation(String fromStation,String toStation)
{      
	 boolean check=false;
	Connection con=JdbcUtils.getConnection();
	try {
		PreparedStatement stmt=con.prepareStatement(DBConstants.DB_QUERY_7);
		 stmt.setString(1, fromStation);
		 stmt.setString(2, toStation);
		 
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
			 check=fromStation.equals(rs.getString("FromStation"))&&toStation.equals(rs.getString("TOSTATION"));
			System.out.println(check);	
			 
			if(check==true)
				{
                  System.out.println(StringConstant.DATA_SHOW);
					
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+" \t "+rs.getInt(6)+" \t "+rs.getInt(7));
			         System.out.println("--------------------------------------------------------");
				}
			
		}

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return check;
	

}

}

