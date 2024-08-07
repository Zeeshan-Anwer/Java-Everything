package com.arrays.strings;

import java.util.Scanner;

public class ArraySortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		boolean ans=isSorted(arr,n);
		if(ans==true)
			System.out.print("Yes");
		else
			System.out.println("NO");
	}
	
	public static boolean isSorted(int arr[],int n) {
		for(int i=1;i<n;i++)
		{
			if(arr[i] < (arr[i-1]))
				return false;
		}	
			return true;
	}


}
