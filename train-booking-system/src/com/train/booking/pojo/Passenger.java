/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.train.booking.pojo;

import java.util.Iterator;

/**
 *
 * @author dell2
 */
public class Passenger {

private int passengerId;
private String passengerName;
private int passengerAge;
private Wallet bankAccount;

    public Passenger(int passengerId, String passengerName, int passengerAge, Wallet bankAccount) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
        this.bankAccount = bankAccount;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public Wallet getBankAccount() {
        return bankAccount;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    public void setBankAccount(Wallet bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
              
        return "Passenger{" + "passengerId=" + passengerId + ", passengerName=" + passengerName + ", passengerAge=" + passengerAge + ", bankAccount=" + bankAccount + '}';
    }



    
}
