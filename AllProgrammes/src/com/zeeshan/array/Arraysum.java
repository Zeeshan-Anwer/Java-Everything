package com.zeeshan.array;

import java.util.Scanner;
class Arraysum
{
	public static void main(String args[]) 
	{
	int n,Sum=0,i;
	Scanner obj = new Scanner(System.in);
	System.out.print("\n Enter Size of Number You want to store");
	n=obj.nextInt();
	int A[]= new int[n];
	
	for(i=0;i<n;i++)
	{
		System.out.print("\n Enter Number");
		A[i]=obj.nextInt();
	}
	System.out.print("----Elements Of Array----\n");
	for(i=0;i<n;i++)
	{
		System.out.print(A[i]+ " ");
		Sum=Sum+A[i];
	}
			System.out.print("\nSum Of Elements="+Sum);
		
	
}
}