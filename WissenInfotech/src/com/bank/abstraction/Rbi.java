package com.bank.abstraction;

abstract public class Rbi {

	
	void login() {
		System.out.println("Sucessfully Login");
	}
	
	void warningMessage() {
		System.out.println("Don't Share your OTP/Pin with anyone");
	}
	
	abstract void accountCreation();
	abstract void rewards();
	abstract void dematCharge();
}
