package com.zeeshan.array;
import java.util.Scanner;
class Arrayoperations
{
	public static void main(String args[])
	{
		int A[],n,i,sum=0;
		Scanner obj= new Scanner(System.in);
		System.out.print("Enter quantity of number to store=");
		n=obj.nextInt();
		A =new int[n];
		for(i=0;i<n;i++)
		{
			System.out.print("\nEnter Number=");
			A[i]=obj.nextInt();
		}
		int min=A[1],max=A[1];
		System.out.print("\n----Array Of Elements----\n");
		for(i=0;i<n;i++)
		{
			System.out.print(A[i]+" ");
			if(max<A[i])
				max=A[i];
			if(min>A[i])
				min=A[i];
			sum=sum+A[i];
		}
		float Average=(float)sum/n;
		System.out.print("\n SUM OF ELEMENTS="+sum);
		System.out.print("\n Average="+Average);
		System.out.print("\n Maximum="+max);
		System.out.print("\n min="+min);
	}
}