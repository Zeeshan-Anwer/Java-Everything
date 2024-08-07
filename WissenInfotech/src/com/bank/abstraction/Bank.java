package com.bank.abstraction;

public class Bank {

	public static void main(String[] args) {

		HDFC person=new HDFC();
		person.login();
		person.warningMessage();
		person.accountCreation();
		person.dematCharge();
		person.rewards();
		System.out.println();
		
		
		DubaiHDFC person1= new DubaiHDFC();
		person1.login();
		person1.warningMessage();
		person1.accountCreation();
		person1.dematCharge();
		person1.rewards();
		person1.virtualDebitCard();

		
	}
}
