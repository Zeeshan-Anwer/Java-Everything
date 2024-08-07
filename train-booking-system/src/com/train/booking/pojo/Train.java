/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.train.booking.pojo;

import java.time.LocalDate;

/** 
 *
 * @author dell2
 */
// This Class Consists of Necessary Attributes of Train 
// And also have defined the Constructor,Getter And Setter Methods 
public class Train {
private int trainNumber;
private String trainName;
private String fromStation;
private String toStation;
private int seatsAvailable;
private int fare;
private String doj;

  public Train(int trainNumber, String trainName, String fromStation, String toStation, int seatsAvailable, int fare) {
        
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.fromStation = fromStation;
        this.toStation = toStation;
        this.seatsAvailable = seatsAvailable;
        this.fare = fare;
      this.doj = doj;
        
    }
public Train(){}
    public int getTrainNumber() {
        return trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getFromStation() {
        return fromStation;
    }

    public String getToStation() {
        return toStation;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public int getFare() {
        return fare;
    }

   

  

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }
	@Override
	public String toString() {
		return "Train [trainNumber=" + trainNumber + ", trainName=" + trainName + ", fromStation=" + fromStation
				+ ", toStation=" + toStation + ", seatsAvailable=" + seatsAvailable + ", fare=" + fare + "]";
	}
	public String getDoj() {
		return doj;
	}
	
	public void setDoj(String doj) {
		this.doj=doj;
	}
	

  

    
    
}
