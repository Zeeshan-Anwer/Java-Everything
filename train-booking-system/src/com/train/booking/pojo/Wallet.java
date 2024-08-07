/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.train.booking.pojo;


/**
*
* @author dell2
*/

public class Wallet{
	private int  actNumber;
	private double  actBalance;
	
	public int getActNum() {
		return actNumber;
	}
	
	//Getter and setter method of Wallet Class

	
	public double getAccBalance() {
		return actBalance;
	}

	
	public void deposit(int amount) {
		actBalance += amount;
	}
	public void Withdraw(int amount) {
		actBalance -=amount;
	}
	public void showBalance() {
		System.out.println("acc Balance ="+actBalance);
	}

    public void setActNumber(int actNumber) {
        this.actNumber = actNumber;
    }

    public void setActBalance(double actBalance) {
        this.actBalance = actBalance;

}
}