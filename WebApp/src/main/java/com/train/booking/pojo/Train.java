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
	private int id;
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
private String trainNumber;
private String trainName;
private String fromStation;
private String toStation;
private  String seatsAvailable;
private String fare;
private String doj;
public String getTrainNumber() {
	return trainNumber;
}
public void setTrainNumber(String trainNumber) {
	this.trainNumber = trainNumber;
}
public String getTrainName() {
	return trainName;
}
public void setTrainName(String trainName) {
	this.trainName = trainName;
}
public String getFromStation() {
	return fromStation;
}
public void setFromStation(String fromStation) {
	this.fromStation = fromStation;
}
public String getToStation() {
	return toStation;
}
public void setToStation(String toStation) {
	this.toStation = toStation;
}
public String getSeatsAvailable() {
	return seatsAvailable;
}
public void setSeatsAvailable(String seatsAvailable) {
	this.seatsAvailable = seatsAvailable;
}
public String getFare() {
	return fare;
}
public void setFare(String fare) {
	this.fare = fare;
}
public String getDoj() {
	return doj;
}
public void setDoj(String doj) {
	this.doj = doj;
}

public Train()
{}
public Train(int id,String trainNumber, String trainName, String fromStation, String toStation, String seatsAvailable, String fare,
		String doj) {
	super();
	this.id=id;
	this.trainNumber = trainNumber;
	this.trainName = trainName;
	this.fromStation = fromStation;
	this.toStation = toStation;
	this.seatsAvailable = seatsAvailable;
	this.fare = fare;
	this.doj = doj;
}
@Override
public String toString() {
	return "Train [id=" + id + ", trainNumber=" + trainNumber + ", trainName=" + trainName + ", fromStation="
			+ fromStation + ", toStation=" + toStation + ", seatsAvailable=" + seatsAvailable + ", fare=" + fare
			+ ", doj=" + doj + "]";
}

}