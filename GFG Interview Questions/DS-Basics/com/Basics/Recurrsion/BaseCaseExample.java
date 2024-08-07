package com.Basics.Recurrsion;

public class BaseCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recurrssion(2);
	}
	
	 static void Recurrssion(int n)
	{
		 // Below Conditions are called
		if(n==0)
			return;
		// Base Case. It use to stop Recurrsion on some cases.
		System.out.println("Hello");
		Recurrssion(n-1);
	}

}
