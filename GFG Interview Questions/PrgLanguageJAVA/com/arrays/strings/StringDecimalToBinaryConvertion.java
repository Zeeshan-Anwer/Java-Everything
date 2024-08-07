package com.arrays.strings;

import java.util.Scanner;

public class StringDecimalToBinaryConvertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		System.out.println(decToBin(s));
	}
	
	public static String decToBin(int n)
	{
		String s=" ";
		while(n>0)
	{
		s=(n%2)+s;
		n=n/2;
		
	}//while
		return s;

}//decToBin
}

//Decimal ko 2 se divide karo until 0 then divident to opposite way se likh lo.

