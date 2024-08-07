package com.train.booking.utils.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.callback.UsernameCallback;
import com.train.booking.trainService.*;
import com.train.StringConstant.StringConstant;
import com.train.booking.pojo.Train;
import com.train.booking.pojo.User;

public class UserServices {

	
	
	public static void NewUserRegistration()
	{
		Connection con=JdbcUtils.getConnection();
		
		//Preparing Query 2 which are present in the DBConstant Class
   try {
	PreparedStatement stmt=con.prepareStatement(DBConstants.User_DB_QUERY_2);
	   //executing insert query 
	 
	Scanner sc= new Scanner(System.in);
	System.out.println(StringConstant.ASK_FIRST_NAME);
	stmt.setString(1, sc.next() );
	System.out.println(StringConstant.ASK_LAST_NAME);
		stmt.setString(2, sc.next());
	System.out.println(StringConstant.ASK_DOB);
		stmt.setString(3, sc.next());
		System.out.println(StringConstant.ASK_PASSWORD);

		stmt.setString(4,sc.next());
		System.out.println(StringConstant.CONTACT);

	stmt.setString(5, sc.next());
	stmt.execute(); // executing all 
	System.err.println("User Successfully Registered");
			

   } catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
					  
		
	}

	public static boolean CheckUserLogin(String firstname,String password) {
		Connection con=JdbcUtils.getConnection();
		//getting connection
		boolean check=false;
		try {
			PreparedStatement stmt=con.prepareStatement(DBConstants.User_DB_QUERY_3);
			
			 stmt.setString(1, firstname);
			 stmt.setString(2, password);
			 
				ResultSet rs=stmt.executeQuery();
		if(rs.next())
		{
           check=  firstname.equals(rs.getString("FIRSTNAME"))&& password.equals(rs.getString("PASSWORD"));			
	 //      check=true; 
	       System.out.println("Login Successfull : WELCOME "+rs.getString("FIRSTNAME"));
	              
		}
			
		else
		{
			if(check==false)
			{
		System.err.println();
			}
		}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
		
		
	}
	
 public static void UserChoiceServices()
 {
	  int choice;
 
	 do
	 {
		 Scanner sc= new Scanner(System.in);
			 System.out.println("****MENU****");
		     System.out.println("1. FIND TRAIN ");
		     System.out.println("2. SEARCH TRAIN BETWEEN STATIONS");
		     System.out.println("3.BOOK TRAIN");
		     System.out.println("4.PRINT TICKET DETAILS");
		       System.out.println("5. CANCEL TICKETS");
		       System.out.println("6. Exit");

		       System.out.println("Enter Your choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Enter Train Number");
		        int ch=sc.nextInt();
		   boolean checkq=TrainAllService.findTrainByTrainNumber(ch);
			  if(checkq==false)
			  {
				  System.err.println("No Train Found");
			  }
		   break;
		case 2:
			System.out.println("Enter Journey Station");
	        String frm=sc.next();
	        System.out.println("Enter Destination Station");
	        String to=sc.next();
	        
		boolean check=TrainAllService.searchTrainBetweenStation(frm, to);
		if(check==false)
		{
	  System.err.println("No Trains Found");
		}
		break;
			
		}
		 
		 
		 }
		 
	 
	 while(choice!=6);

 }	

public static void adminUserChoice()
{
	int choice;

	do
	{ 
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		
		System.out.println("Enter Your Choice");			
	    System.out.println("1.Insert Train");
	    System.out.println("2.View Train By Train Number");
	    System.out.println("3.Update Train");
	    System.out.println("4.View All Train");
	    System.out.println("5.Delete Train");
	    System.out.println("6.Exit");
		
	    choice=sc.nextInt();
	  
	    
		switch(choice)
		{
		 
		case 1:
		System.out.println(StringConstant.TRAIN_NO);
	       int trainno=sc.nextInt();
		 System.out.println(StringConstant.TRAIN_NAME);
		String trainname=sc2.nextLine();
		System.out.println(StringConstant.TO_STATION);
		String traintostation=sc2.nextLine();
		
		System.out.println(StringConstant.FROM_STATION);
		String trainfromstation=sc2.nextLine();
		
		System.out.println(StringConstant.AVAILABLE_SEATS);
		int trainseats=sc.nextInt();
		
		System.out.println(StringConstant.TRAIN_FARE);
		int trainfare=sc.nextInt();
		 
	     TrainAllService.insertTrain(new Train(trainno, trainname, traintostation, trainfromstation,trainseats, trainfare));
		
	           break;
	           
		case 2:
			System.out.println(StringConstant.TRAIN_NO);
			int id=sc.nextInt();
			TrainAllService.findTrainByTrainNumber(id);;
			 break;
		case 3:
			System.out.println(StringConstant.TRAIN_NO);
	     trainno=sc.nextInt();
		 System.out.println(StringConstant.TRAIN_NO);
		 trainname=sc2.nextLine();
		System.out.println(StringConstant.TO_STATION);
		 traintostation=sc2.nextLine();
		
		System.out.println(StringConstant.FROM_STATION);
		 trainfromstation=sc2.nextLine();
		
		System.out.println(StringConstant.AVAILABLE_SEATS);
		 trainseats=sc.nextInt();
		
		System.out.println(StringConstant.TRAIN_FARE);
		 trainfare=sc.nextInt();
		 
	     TrainAllService.updateTrain(new Train(trainno, trainname, traintostation, trainfromstation,trainseats, trainfare));
		
			
			break;
		case 5:
			System.out.println(StringConstant.TRAIN_ID);
			int trainid=sc.nextInt();
			TrainAllService.deleteTrain(trainid);
			System.out.println(StringConstant.DELETED); 
			break;
		case 4: TrainAllService.viewAllTrain();
		          break;
		}
	}
	
	
	while(choice!=6);
}	






}
