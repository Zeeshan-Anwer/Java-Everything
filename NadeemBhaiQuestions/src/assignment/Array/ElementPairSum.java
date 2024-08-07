package assignment.Array;

import java.util.Scanner;

public class ElementPairSum {

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
		System.out.println("Enter Sum= ");
		int sum=sc.nextInt();
		getPairSum(arr,sum);
	}
	
	public static void getPairSum(int arr[],int sum)
	{
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum)
					System.out.println(arr[i]+" "+arr[j]);
			//Output Message Missed
				
			}
	}
}