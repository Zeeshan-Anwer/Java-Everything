package com.mypractice;

import java.util.Scanner;

public class SumOfUniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter value of"+i+" Element: ");
			arr[i]=sc.nextInt();
		}
		removeDuplicate(arr);
		
		
	}
	public static void removeDuplicate(int[] arr)
	{
		int size=arr.length;
		//int index=(arr.length-1);
		int i=0,Sum=0;
		while(i<size) 
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
					break;
				if(arr[i]!=arr[j] && j==arr.length-1)
				{
					System.out.print(arr[i]+" ");
					Sum=Sum+arr[i];
				}
			}
			i++;
		}
		System.out.println("Sum"+Sum);
}
}