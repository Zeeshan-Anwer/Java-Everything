/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.training.booking.main;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.train.StringConstant.StringConstant;
import com.train.booking.pojo.Admin;
import com.train.booking.pojo.Passenger;
import com.train.booking.pojo.Ticket;
import com.train.booking.pojo.Train;
import com.train.booking.pojo.Wallet;
import com.train.booking.ticket.TicketService;
import com.train.booking.trainService.TrainService;

/**
 *
 * @author dell2
 */
public class TrainMain {
    static List<Passenger> list= new LinkedList();
    static Wallet b1= new Wallet();
    static List<Ticket> allTickets= new LinkedList<>();
    static  Admin user= new Admin();
     
    public static void main(String[] args) {
     user.setName("Admin");
     user.setPassword("123");
     
     b1.setActNumber(102487);
     b1.setActBalance(10000);
 
     System.out.println(StringConstant.STAR_PATTERN);
          int choice;
           int chooseRole;
          
           Scanner sc=new Scanner(System.in);
   do{
          System.out.println("Choose user");
          System.out.println("1. Admin");
          System.out.println("2. User");
          System.out.println("0. Exit");
           chooseRole=sc.nextInt();
           if(chooseRole==1)
           {
               System.out.println(StringConstant.ASK_ID);
               String name=sc.next();
               System.out.println(StringConstant.ASK_PASSWORD);
               String password=sc.next();
                
               String res=Admin.AdminLogin(name, password);
                if(res.equals(StringConstant.LOGGED_IN))
                {
                 break;
                }
                
                
               
                
               
           }
   
    }
   while(chooseRole!=0);
           
          
        do
    {
        System.out.println("****MENU****");
          System.out.println("1. FIND TRAIN ");
          System.out.println("2. SEARCH TRAIN BETWEEN STATIONS");
          System.out.println("3.BOOK TRAIN");
          System.out.println("4.PRINT TICKET DETAILS");
            System.out.println("5. CANCEL TICKETS");
          
               System.out.println("Enter your Choice");
     //     Scanner sc= new Scanner(System.in);
               choice=sc.nextInt();
             if(choice==1)
             {
                     System.out.println(StringConstant.TRAIN_NO);
                     int trainNo=sc.nextInt();
                     Train print=TrainService.findTrain(trainNo);
                  System.out.println(print);
                 
             }
             if(choice==2)
             {      System.out.println(StringConstant.FROM_STATION);
                     String fromStation=sc.next();
                    System.out.println(StringConstant.TO_STATION);
                     String toStation=sc.next(StringConstant.ASK_DOB);
                     System.out.println();
                        String date=sc.next();
                     LocalDate travelDate=LocalDate.parse(date);
                    TrainService.searchTrainBetweenStations(fromStation, toStation, travelDate, choice);
                 
             }
             if(choice==3)
             {
                    
                  System.out.println(StringConstant.TRAIN_NO);
                 int trainNumber =sc.nextInt();
                 System.out.println(StringConstant.ADD_PASSENGER_OPTION);
                  do   
                  {
                      System.out.println(StringConstant.ASK_ID);
                  int passengerId=sc.nextInt();
                  System.out.println(StringConstant.PASSENGER_ID);
                    String name=sc.next();
                    System.out.println(StringConstant.PASSENGER_AGE);
                    int age=sc.nextInt();
                   
                  
                  Passenger details= new Passenger(passengerId,name,age,b1);
                    list.add(details);
                      System.out.println("Want to Add More Details");
                      System.out.println("Press 1 for YES");
                      System.out.println("Press 2 for NO Move Forward To Book Tickets");
                      
                      choice=sc.nextInt();
                      if(choice==2)
                        {        
                             System.out.println("Here Your Details");
                              Iterator<Passenger> itr=list.iterator();
                               while(itr.hasNext())
                               {
                                   Passenger pr=itr.next();
                                   System.out.println(pr);
                               }
                             System.out.println("Press 1 For Confirm");
                             int confirm=sc.nextInt();
                             if(confirm==1)
                             {
                          TrainService.bookTickets(trainNumber, list);       
                                 
                             }
                           System.out.println("Thank You");
                        }
                     
                      break;
                  
                  }
                  while(choice!=0);
                
                 }
             if(choice==5)
             {
                 System.out.println("Enter the pnr num");
                  int pnr=sc.nextInt();
                  System.out.println("Your Ticket Details are");
                 Ticket details=   TicketService.removeTicket(pnr);
                     System.out.println(details);      
                 System.out.println("Need to Cancel");
                 System.out.println("1. Cancel All Tickets");
                 System.out.println("2.Exit");
                  choice=sc.nextInt();
                  if(choice ==1)
                  {
                      
                       TicketService.CancelledTicket(pnr);
                      System.out.println(StringConstant.TICKET_CANCEL);
                  
                  }
                 if(choice ==2)
                 {
                  break;
                 }
             
             }
                   if(choice==4)
                       TicketService.PrintTickets();
               
             }
        
             while(choice!=0);
     
        } 
                 
   
   
    
    }
    

