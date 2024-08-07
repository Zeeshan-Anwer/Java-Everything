package com.bank.rbi;

public class SBIPune implements SBIGuidelines {
	
	SBIPune(){
		System.out.println("Welcome To SBI");
	}
	
	@Override
	public void accountBranch() {
		System.out.println("Your SBI Account Branch will be in  Pune");
		
	}

	@Override
	public void minimumBalance() {
		System.out.println("1000 Minimum Balance Is Required");
		
	}

	@Override
	public void debitCardCharge() {
		System.out.println("50 Rupee Will Charge Per Year For Debit Card");
		
	}

	@Override
	public void virtualDebitCard() {
		System.out.println("Currently Virtual Debit Facality is not available in this branch");

}
}
