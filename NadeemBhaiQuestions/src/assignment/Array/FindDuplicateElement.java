
/*1)Write a Java Program to find duplicate elements in given Array?

Input:  1, 2, 5, 5, 6, 6, 7, 2

Output:  2, 5, 6
*/

package assignment.Array;

import java.util.Scanner;

public class FindDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		getDuplicateElement(arr);
		}
		public static void getDuplicateElement(int arr[])
		{
			int size=arr.length;
			int count=0;
			for(int i=0;i<size;i++) 
			{
			for(int j=i+1;j<size;j++)
				{
				
					if(arr[j]==arr[i])
						System.out.println(arr[i]);
	}
			
		}

}
}