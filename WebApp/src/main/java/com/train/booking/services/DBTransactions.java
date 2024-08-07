package com.train.booking.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

import com.train.booking.pojo.Address;
import com.train.booking.pojo.Person;
import com.train.booking.pojo.Profile;
import com.train.booking.pojo.Train;
import com.train.booking.utils.JdbcUtils;


public class DBTransactions {


	public static void registerUser(Person person)
	{
		Connection con=JdbcUtils.getConnection();
	    String query="insert into user_details(FIRSTNAME,LASTNAME,USERNAME,PASSWORD,ADDRESS1,ADDRESS2)values(?,?,?,?,?,?);";;
		try {
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, person.getFirstName());
			pstmt.setString(2, person.getLastName());
	        pstmt.setString(3, person.getProfile().getUserName());
	        pstmt.setString(4, person.getProfile().getPassword());
	       Address address=person.getAdList().get(0);
	       pstmt.setString(5, address.getAddressLine1());
	       pstmt.setString(6, address.getAddressLine2());
	       pstmt.execute();
	       
	       
			
			
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		        }
		 
	}		
		
	
	public static boolean verufyUserCredentials(Profile profile)
	{
		Connection con=JdbcUtils.getConnection();
		String query= "select * from user_details where username=? AND password=?";
      try {
		PreparedStatement pstmt= con.prepareStatement(query);
	   pstmt.setString(1, profile.getUserName());
	   pstmt.setString(2, profile.getPassword());
	   
		ResultSet rs= pstmt.executeQuery();
	   if(rs.next())
	   {
	     	 return true;  
	   }
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();

	}
	return false;
		 
		
	}



public static boolean insertTrain(Train train)
{
	
	//Getting connection  
			Connection con=JdbcUtils.getConnection();
			
			try {
					   
				//Preparing Query 2 which are present in the DBConstant Class
				
				String insertQuery="insert into train_details(TRAINNUMBER,TRAINNAME,FROMSTATION,TOSTATION,SEATSAVAILABLE,FARE,DATEOFJOURNEY)values(?,?,?,?,?,?,?);";
				PreparedStatement stmt=con.prepareStatement(insertQuery);
						  
							stmt.setString(1, train.getTrainNumber());
							stmt.setString(2, train.getTrainName());
							stmt.setString(3, train.getFromStation());
							stmt.setString(4, train.getToStation());
							stmt.setString(5, train.getSeatsAvailable()); 
							stmt.setString(6, train.getFare());
							
							
							stmt.setString(7, train.getDoj());
						     int value=stmt.executeUpdate();
							
							if(value>0)
							{
	                           return true; 							
								
							}
							else
							{
								return false;
							}
				   } catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
	
							return false;
							
				   }
			

}  


public static List<Train> getAllTrainsRecords()
{
	List<Train> trainList= new ArrayList<Train>();
	
	Connection con=JdbcUtils.getConnection();
	
	String query="Select * from train_details";
	
	try {
		PreparedStatement stmt=con.prepareStatement(query);
                 ResultSet rs=stmt.executeQuery();
      while(rs.next())
      {
    	  Train train= new Train();
    	                     
    	  train.setId(rs.getInt("ID"));
    	  train.setTrainNumber(rs.getString("TRAINNUMBER"));
    	  train.setTrainName(rs.getString("TRAINNAME"));
    	  train.setFromStation(rs.getString("FROMSTATION"));
    	  train.setToStation(rs.getString("TOSTATION"));
    	  train.setSeatsAvailable(rs.getString("SEATSAVAILABLE"));
    	  train.setFare(rs.getString("FARE"));
    	  
    	  
    	  train.setDoj(rs.getString("DATEOFJOURNEY"));
    	 
    	  trainList.add(train);
    	  
    	  
    	  
      }
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return trainList ;

	
	
}


public static boolean deleteTrainsRecords(int id)
{
	
	Connection con=JdbcUtils.getConnection();
	
	String query="delete from train_details where id=?";
     try {
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, id);
		int check=pstmt.executeUpdate();
		
		if(check>0)
		{
			return true;
			
		}
		else
		{
			return false;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
     
	
}

public static int updateTrainsRecords(Train train)
{
	int r=0;
   Connection con=JdbcUtils.getConnection();
	
	String query="UPDATE train_details SET TRAINNUMBER=?, TRAINNAME=?,FROMSTATION=?,TOSTATION=?, SEATSAVAILABLE=?,FARE=? , DATEOFJOURNEY=? WHERE ID=?;";
	try {
		PreparedStatement stmt = con.prepareStatement(query);
	  stmt.setInt(8, train.getId());
		stmt.setString(1, train.getTrainNumber());
		stmt.setString(2, train.getTrainName());
		stmt.setString(3, train.getFromStation());
		stmt.setString(4, train.getToStation());
		stmt.setString(5, train.getSeatsAvailable()); 
		stmt.setString(6, train.getFare());
		
		
		 stmt.setString(7, train.getDoj());
		
		 
	     
		  r=stmt.executeUpdate();
		  System.out.println(r);
				
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();


	}
	
	
	return r;	
	

}

public static List<Train> searchTrainsRecords(int trainNumber)
{
	List<Train> trainList= new ArrayList<Train>();
  	
	Connection con=JdbcUtils.getConnection();
	
	String query="Select * from train_details where id =?";
	
	try {
		PreparedStatement stmt=con.prepareStatement(query);
		stmt.setInt(1, trainNumber);
		       
		ResultSet rs=stmt.executeQuery();
      while(rs.next())
      {
      	  Train train= new Train();
      	    	                     
    	  train.setId(rs.getInt("ID"));
    	  train.setTrainNumber(rs.getString("TRAINNUMBER"));
    	  train.setTrainName(rs.getString("TRAINNAME"));
    	  train.setFromStation(rs.getString("FROMSTATION"));
    	  train.setToStation(rs.getString("TOSTATION"));
    	  train.setSeatsAvailable(rs.getString("SEATSAVAILABLE"));
    	  train.setFare(rs.getString("FARE"));
    	  
    	  
    	  train.setDoj(rs.getString("DATEOFJOURNEY"));
    	  	 
    	  trainList.add(train);
    	  
              
         }
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
		 
	}
	return trainList;
	
	
	

	
	
}
}