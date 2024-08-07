package assignment.Array;

import java.util.Scanner;

public class SmallestPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size= ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+i+" Element: " );
			arr[i]=sc.nextInt();
		}
		System.out.println(getSmallestPair(arr));
	}
	public static int getSmallestPair(int arr[])
	{
		int small1=getSmallNum(arr);
		int small2=arr[0];
		for(int i=1;i<arr.length;i++)
			//for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==small1)
					break;
			}
	}
	public static int getSmallNum(int arr[])
	{
		int n=arr[0];
		for(int i=1;i<n;i++)
		{
			if(n>arr[i])
				n=arr[i];
		}
		return n;
	}
}

