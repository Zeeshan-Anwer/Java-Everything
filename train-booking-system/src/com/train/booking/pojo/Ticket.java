/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.train.booking.pojo;

import java.util.List;

/**
 *
 * @author dell2
 */
public class Ticket {
    
    private int pnr;
    private Train bookedTrain;
    private List<Passenger> passengerList;

    public Ticket(int pnr, Train bookedTrain, List<Passenger> passengerList) {
        this.pnr = pnr;
        this.bookedTrain = bookedTrain;
        this.passengerList = passengerList;
    }

    public int getPnr() {
       Ticket tic;
      
        return pnr;
     
    }

    public Train getBookedTrain() {
        return bookedTrain;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPnr(int pnr) {
        this.pnr = pnr;
    }

    public void setBookedTrain(Train bookedTrain) {
        this.bookedTrain = bookedTrain;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    @Override
    public String toString() {
        return "Ticket{" + "pnr=" + pnr + ", bookedTrain=" + bookedTrain + ", passengerList=" + passengerList + '}';
    }
    



}
