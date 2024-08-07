package com.arrays.strings;

/*You are given a array that contains integers.
You need to return the sum of all array elements.

Your Task: 
Write the code to return the sum of all array elements. 
The array is provided as a parameter to the function arraySum. 
Don't print the output, just return it as it will be printed by the driver code.
*/



public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int answer=arraySum(arr);
		System.out.println("Sum= "+answer);
		
	}
	public static int arraySum(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
}

