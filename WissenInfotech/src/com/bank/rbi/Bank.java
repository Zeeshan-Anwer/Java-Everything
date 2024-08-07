package com.bank.rbi;

public class Bank {

	public static void main(String[] args) {
		
		SBIGuidelines branch;
		
	branch=new SBIPune();
		
		branch.accountBranch();
		branch.minimumBalance();
		branch.debitCardCharge();
		branch.virtualDebitCard();
		System.out.println("****************************************************");
		
	branch=new SBIHyderabad();
		
		branch.accountBranch();
		branch.minimumBalance();
		branch.debitCardCharge();
		branch.virtualDebitCard();
		System.out.println("****************************************************");
		
	branch=new SBIBanglore();
		
		branch.accountBranch();
		branch.minimumBalance();
		branch.debitCardCharge();
		branch.virtualDebitCard();
	}

}
