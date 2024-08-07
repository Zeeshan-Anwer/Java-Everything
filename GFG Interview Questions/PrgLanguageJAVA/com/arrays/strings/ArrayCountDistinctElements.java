package com.arrays.strings;
import java.util.Scanner;
public class ArrayCountDistinctElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(getDistinctCount(arr,n));
	}
	
	public static int getDistinctCount(int []a,int n){
		int count=0;
		boolean isDistinct=true;
		for(int i=0;i<n;i++)
		{
			for(int j=(i-1);j>=0;j--)
			{
				if(a[i]==a[j]) {
					isDistinct=false;
					break;
				}
				if(isDistinct==true)
					count++;
			}
			
		}
		return count;
	}
		
}
