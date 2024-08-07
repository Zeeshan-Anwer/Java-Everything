

/**
 * Train.java
 * This is a model class represents a Train entity

 *
 */
package model;

import java.time.LocalDate;

/** 
 *
 * @author dell2
 */
// This Class Consists of Necessary Attributes of Train 
// And also have defined the Constructor,Getter And Setter Methods 
public class Train {
public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
private int trainNumber;
private String trainName;
private String fromStation;
private String toStation;
private int seatsAvailable;
private int fare;
private String doj;
public int getTrainNumber() {
	return trainNumber;
}
public void setTrainNumber(int trainNumber) {
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
public int getSeatsAvailable() {
	return seatsAvailable;
}
public void setSeatsAvailable(int seatsAvailable) {
	this.seatsAvailable = seatsAvailable;
}
public int getFare() {
	return fare;
}
public void setFare(int fare) {
	this.fare = fare;
}
public String getDoj() {
	return doj;
}
public void setDoj(String doj) {
	this.doj = doj;
}
public Train(int trainNumber, String trainName, String fromStation, String toStation, int seatsAvailable, int fare,
		String doj) {
	super();
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
	return "Train [trainNumber=" + trainNumber + ", trainName=" + trainName + ", fromStation=" + fromStation
			+ ", toStation=" + toStation + ", seatsAvailable=" + seatsAvailable + ", fare=" + fare + ", doj=" + doj
			+ "]";
}


}