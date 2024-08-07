package com.arrays.strings;

import java.util.Scanner;

public class ArrAverageNewApproach {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println(average(a));
	}
	public static double average(int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		double avg=sum/a.length;	//because average can be in decimal
		System.out.println(sum);
		return avg;
	}
}
