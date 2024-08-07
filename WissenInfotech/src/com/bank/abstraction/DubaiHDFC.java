package com.bank.abstraction;

public class DubaiHDFC extends Rbi implements cards {
	
	public DubaiHDFC() {
		System.out.println("Welcome to Dubai Branch of HDFC Bank");
	}

	@Override
	void accountCreation() {
		System.out.println("Your HDFC account created in Dubai Branch");
		
	}

	@Override
	void rewards() {
		System.out.println("Eligible for 10% Cashback in every online transaction");
		
	}
	
	@Override
	void dematCharge() {
		System.out.println("50% off in Demat Account");
		
	}

	@Override
	public void virtualDebitCard() {
		System.out.println("Vitual Debit card is available for dubai branch users");
		
	}
	
		
	}
