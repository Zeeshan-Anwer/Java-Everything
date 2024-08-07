package com.wissen.Test;

public class Test {

	public static void main(String[] args) {
		int rows=10;
		int column=10;
		
	for(int i=1; i<=rows; i++)
		{
			for (int j= i; j<=rows; j++) {
				System.out.print("*");
			}
			for(int k =1; k <=i*2; k++) {
				System.out.println();
			}
	for(int l =i; l<=rows; l++) {
		System.out.print("*");
	}
		System.out.println();
		}
	for(int i =1; i<=rows; i++) {
		 for(int j =1; j<=i; j++) {
			 System.out.print("*");
		 }
		 for(int k =i*2-2; k< rows*2-2; k++) {
			System.out.println(); 
		 }
		 for(int l=1; l<=i; l++) {
			 System.out.print("*");
		 }
		 System.out.println();
	}
	
		
		
		}

	

}
