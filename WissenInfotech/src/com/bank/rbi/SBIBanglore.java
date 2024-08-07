package com.bank.rbi;

public class SBIBanglore implements SBIGuidelines{
	
	SBIBanglore(){
		System.out.println("Welcome To SBI");
	}

	@Override
	public void accountBranch() {
		System.out.println("Your SBI Account Branch will be in Banglore");
		
	}

	@Override
	public void minimumBalance() {
		System.out.println("3000 Minimum Balance Is Required");
		
	}

	@Override
	public void debitCardCharge() {
		System.out.println("150 Rupee Will Charge Per Year For Debit Card");
		
	}

	@Override
	public void virtualDebitCard() {
		System.out.println("Virtual Debit Facality is available in this branch");
		
	}


}
