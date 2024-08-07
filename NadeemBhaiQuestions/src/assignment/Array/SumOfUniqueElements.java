/*
 * Write a Java Program to find sum of unique elements in given Array?
 

Input = {1, 6, 4, 3, 2, 2, 3, 8, 1};
Output : 24 
(Unique elements are: 1, 6, 4, 3, 2, 8)
*/

/*1)
2)Write a Java Program to remove duplicate elements in given Array?

Input:  1, 2, 5, 5, 6, 6, 7, 2

Output:  1, 2, 5, 6, 7
*/

package assignment.Array;

import java.util.Scanner;

public class SumOfUniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		getSumOfUnique(arr);
		}
		public static void getSumOfUnique(int arr[])
		{
			int size=arr.length;
			int count=0;
			int Sum=0;
			for(int i=0;i<size;i++) 
			{
			for(int j=i+1;j<size;j++)
				{
					if(arr[i]==arr[j])
						break;
				
					if(arr[j]!=arr[i] & (j==size-1))
						Sum=Sum+arr[i];
				}
			
			}
			Sum=Sum+arr[size-1];
			System.out.println("Sum of Unique: "+Sum);
		}
}