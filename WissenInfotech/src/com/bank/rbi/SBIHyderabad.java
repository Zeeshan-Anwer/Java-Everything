package com.bank.rbi;

public class SBIHyderabad implements SBIGuidelines {
	
	SBIHyderabad(){
		System.out.println("Welcome To SBI");
	}
	
	@Override
	public void accountBranch() {
		System.out.println("Your SBI Account Branch will be Hyderabad");
		
	}

	@Override
	public void minimumBalance() {
		System.out.println("2000 Minimum Balance Is Required");
		
	}

	@Override
	public void debitCardCharge() {
		System.out.println("100 Rupee Per Year Will Charge For Debit Card");
		
	}

	@Override
	public void virtualDebitCard() {
		System.out.println("Virtual Debit Facality will be available soon in this branch");

}
}
