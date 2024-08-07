package assignment.Array;

import java.util.Scanner;

public class Commonbtw3 {

	public static void main(String[] args) 
	{
		//int arr1[],arr2[],arr3[],c=0;
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
			System.out.println("Enter Array Size= ");
			int n1=sc.nextInt();
			int arr1[]=new int[n1];
			
				for(int i=0;i<n1;i++)
					{
						System.out.println("Enter "+i+" Element: " );
						arr1[i]=sc.nextInt();
					}
				System.out.println("Enter Array Size= ");
				int n2=sc.nextInt();
				int arr2[]=new int[n2];
				
					for(int i=0;i<n2;i++)
						{
							System.out.println("Enter "+i+" Element: " );
							arr2[i]=sc.nextInt();
						}
					getCommon(arr,arr1,arr2);

	}
	
	public static void getCommon(int arr[],int arr1[],int arr2[])
	{
		for(int i=0;i<arr.length;i++)
		{
			K:
			for(int j=1;j<arr1.length;j++)
			{
				if(arr[i]==arr1[j])
				{
					for(int k=0;k<arr2.length;k++)
					{
						if(arr[i]==arr2[k])
						{
							System.out.println(arr[i]);
						break;
						
						}
					}
				}
			}
		}
	
	}

}
