package Array.basic.zeeshan;

import java.util.Scanner;

public class RemoveDuplicateFromSortedArray {

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
			remDupsEfficient(arr);
	}
	
	public static int remDupsNaive(int arr[])
	{
		int temp[]=new int[arr.length];
		temp[0]=arr[0];
		int res=1;
		for(int i=1;i<arr.length;i++)
		{
			if(temp[res-1]!=arr[i])
			{
				temp[res]=arr[i];
				res++;
				
			}
		}
		for(int i=0;i<res;i++)
			arr[i]=temp[i];
		return res;
	}
	
	public static int remDupsEfficient(int arr[])
	{
		int res=1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[res-1])
			{
				arr[res]=arr[i];
				res++;
			}
		}
		return res;
	}

}
