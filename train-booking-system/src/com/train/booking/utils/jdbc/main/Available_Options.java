package com.train.booking.utils.jdbc.main;

import java.util.Scanner;

import com.train.StringConstant.StringConstant;
import com.train.booking.pojo.Admin;
import com.train.booking.utils.jdbc.UserServices;

public class Available_Options {
	static Scanner sc=new Scanner(System.in);
	
	
	public static void getOptions() {
	  int chooseRole;  
	  int choice;
	  
	do{
		      
        System.out.println("Choose user");
        System.out.println("1. Admin");
        System.out.println("2. User");
        System.out.println("3. Exit");
         chooseRole=sc.nextInt();
         if(chooseRole==1)
         {
             System.out.println(StringConstant.ASK_ID);
             String name=sc.next();
             System.out.println(StringConstant.ASK_PASSWORD);
             String password=sc.next();
              
             //Calling AdminLogin Method and it will return a String
             String res=Admin.AdminLogin(name, password);
          
             if(res.equals(StringConstant.LOGGED_IN))
              {
              	System.out.println(StringConstant.LOGGED_IN);
                    
              	UserServices.adminUserChoice();
                 
              }
             else
             {
          	   System.err.println(StringConstant.WRONG_CREDENTIALS);
          	   
             }
         
         }
             if(chooseRole==2)
             {
                 System.out.println("1.New User Registration");    	   
          	   System.out.println("2.Login");
          	   choice=sc.nextInt();
          	   switch(choice)
          	   {
          	   case 1:
                     	            		               		    
           		   UserServices.NewUserRegistration();
          		   break;
          	   case 2: 
          		    System.out.println(StringConstant.ASK_ID);
          		    String name=sc.next();
          		    System.out.println(StringConstant.ASK_PASSWORD);
          		     String pass=sc.next();
          		    
          		     boolean check=UserServices.CheckUserLogin(name, pass);
	            		     if(check==true)
	            		     {
	            		    	 UserServices.UserChoiceServices();
	            		    	 break;
	            		    	 
	            		     }
          		   
 	            	   
          	   }
          	   
             }
        	                
             if(chooseRole==3)
	                
             {
          	   System.out.println(StringConstant.EXIT);
          	   break;
             }
              
             
         
 
  }
 while(chooseRole!=3);
	}

}

