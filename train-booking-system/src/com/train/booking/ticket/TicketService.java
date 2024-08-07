/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.train.booking.ticket;

import com.train.StringConstant.StringConstant;
import com.train.booking.pojo.Passenger;
import com.train.booking.pojo.Ticket;
import com.train.booking.pojo.Train;
import com.train.booking.trainService.TrainService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author dell2
 */

public class TicketService {
    
  static  Ticket ticket;
  static List<Ticket> allTickets= new ArrayList<>();

public static void addNewTicket(int trainNumber,List<Passenger> passengerList)
{
         int pnr=allTickets.size()+1;
            Train bookedTrain=TrainService.findTrain(trainNumber);
      allTickets.add(new Ticket(pnr,bookedTrain,passengerList));
    System.out.println(StringConstant.TICKER_BOOKED);
      System.out.println(allTickets);
   
}
    
public static Ticket removeTicket(int pnr)
{
     Ticket temp=null;
            for(Ticket print:allTickets)
            {
             if(print.getPnr()==pnr)
             {
                temp=print;
             }
            
            }
            
          return temp;
          
    
    
}
public static void CancelledTicket(int pnr)
{
 
     Iterator<Ticket> itr=allTickets.iterator();
     while(itr.hasNext())
     {
      Ticket r= itr.next();
      if(r.getPnr()==pnr)
      {
       itr.remove();
      }
         System.out.println("removed "+r.getBookedTrain());
     }

}

    public static void PrintTickets() {
    
   System.out.println("Your Ticket Details");
    for(Ticket a:allTickets)
    {
         Train d=a.getBookedTrain();
        List<Passenger> details=a.getPassengerList();
        System.out.println("PNR "+a.getPnr()+"\t\tDate of Journey "+d.getDoj());
         Iterator itr=details.iterator();
         while(itr.hasNext())
         {
             
             
             System.out.println(itr.next());
             
         }
        
        // System.out.println(a.getPnr()+"\b"+a.getPassengerList()+"\n"+a.getBookedTrain());
    
    }
   
    
    }
    
}
