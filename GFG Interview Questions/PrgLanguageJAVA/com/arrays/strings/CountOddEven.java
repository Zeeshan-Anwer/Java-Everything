package com.arrays.strings;
import java.util.Scanner;
public class CountOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int even=0, odd=0;
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		if(a[i]%2==0)
			even++;
		else
			odd++;
		
	}
		System.out.println("Even occur times: "+even +"\nOdd occurs times: "+odd);
	}
}
