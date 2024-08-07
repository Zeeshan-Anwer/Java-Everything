package assignment.Array;

import java.util.Scanner;

public class SecondMaxMin {

	public static void main(String[] args)
	{
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
		System.out.println(getDiffrence(arr));
	}
		
		public static int getDiffrence(int arr[])
		{
		int Min,Max;
		Min=Max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(Max<arr[i])
				Max=arr[i];
			if(Min>arr[i])
				Min=arr[i];
		}
		return;
		
		}
		
	}



