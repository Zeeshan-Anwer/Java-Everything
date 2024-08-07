/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.train.booking.trainService;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import com.train.StringConstant.StringConstant;
import com.train.booking.pojo.Passenger;
import com.train.booking.pojo.Train;
import com.train.booking.pojo.Wallet;
import com.train.booking.ticket.TicketService;

/**
 *
 * @author dell2
 */
public class TrainService {

 static List<Train> allTrains= new LinkedList<>();    

	/*
	 * static { allTrains.add(new
	 * Train(101,"Train One","Indore","Banglore",100,700,LocalDate.now()));
	 * allTrains.add(new
	 * Train(102,"Train two","Banglore","Indore",100,700,LocalDate.now()));
	 * allTrains.add(new
	 * Train(103,"Train three","Indore","Banglore",90,600,LocalDate.now()));
	 * allTrains.add(new
	 * Train(104,"Train four","Hyderabad","Banglore",100,600,LocalDate.now()));
	 * allTrains.add(new
	 * Train(105,"Train five","Banglore","Hyderabad",80,500,LocalDate.now()));
	 * allTrains.add(new
	 * Train(106,"Train six","Indore","Punjab",100,700,LocalDate.now()));
	 * allTrains.add(new
	 * Train(107,"Train seven","Banglore","New Delhi",100,1000,LocalDate.now())); }
	 */

//This Static method allows user to Find Train Using the Train number
// just he has to pass or enter the Train number

//public static void InsertTrainDetails() 
//{
//	Scanner sc2= new Scanner(System.in);
//
//	Scanner sc= new Scanner(System.in);
//	System.out.println("Enter train number");
//	 int trainNumber=sc.nextInt();
//	 System.out.println("Enter train name");
//	 String trainName=sc2.nextLine();
//	 System.out.println("Enter From Station");
//	  String fromStation=sc2.nextLine();
//	  System.out.println("Enter To Station");
//	  String toStation=sc2.nextLine();
//	  System.out.println("Enter Seats Available");
//	  int seatsAvailable=sc.nextInt();
//	  System.out.println("Enter fare");
//	  int fare=sc.nextInt();
//	  System.out.println("Enter the date");
//	  
//	
//	Train obj= new Train(trainNumber, trainName, fromStation, toStation,seatsAvailable ,fare);
//	 
//}

public static Train findTrain(int trainNumber)
{
     //    System.out.println(LocalDate.now());
            Train temp=null;
            for(Train print:allTrains)
            {
             if(print.getTrainNumber()==trainNumber)
             {
                temp=print;
             }
            }   
          return temp;
}

//This Static method finds the train on specific date 


public static void searchTrainBetweenStations(String fromStation,String toStation,LocalDate doj,int numofSeats)
{
    List<Train> searchTrainList= new LinkedList<>();
   for(Train t:allTrains)
   {
     if(t.getFromStation().equals(fromStation)&&t.getToStation().equals(toStation)
             &&t.getDoj().equals(doj)&&t.getSeatsAvailable()>numofSeats)
     {
            searchTrainList.add(t);
      
     }
         
   }
   if(searchTrainList.size()==0)
   {
       System.out.println("No train found");
   
   
   }
   
   else
   {
   System.out.println(StringConstant.AFTER_LOGIN_OPTIONS);
    System.out.println("");
     for(Train t:searchTrainList)
     {
         System.out.printf("%4d%20s%15s%15s%12s%4d%5d\n",t.getTrainNumber(),t.getTrainName(),t.getFromStation(),t.getToStation(),t.getDoj(),t.getSeatsAvailable(),t.getFare());
      
     }
 
   
   }
}  
 // this method allows user to booktTickets 
 // user has to pass the train no and number of passenger list
   public static void bookTickets(int trainNumber,List<Passenger> passengerList)
   {
        int numOfSeats=passengerList.size();
      Passenger tempPassenger=passengerList.get(0);
      Wallet account=tempPassenger.getBankAccount();
              Train tempTrain=findTrain(trainNumber);
             int fare= tempTrain.getFare();
             int totalFare= fare*numOfSeats;
             account.Withdraw(totalFare);
   
   
     tempTrain.setSeatsAvailable(tempTrain.getSeatsAvailable()-numOfSeats);
     TicketService.addNewTicket(trainNumber,passengerList);
   }


}
