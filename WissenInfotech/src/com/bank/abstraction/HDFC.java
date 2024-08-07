package com.bank.abstraction;

public class HDFC extends Rbi implements cards {
	
	public HDFC() {
		System.out.println("Welcome to Indian Branch of HDFC Bank");
	}
		
	
	void accountCreation() {
		System.out.println("HDFC Bank Account Created Successfully");
		
	}

	
	void rewards() {
		System.out.println("Eligible for 5% Cashback in every online transaction");
		
	}

	
	void dematCharge() {
		System.out.println("25% off in Demat Account");
		
	}

	@Override
	public void virtualDebitCard() {
		System.out.println("Currently vitual debit card not available for this branch");
		
	}
	
	
	
}
