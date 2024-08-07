package com.zeeshan.array;

import java.util.Scanner;
class Matrixtranspose
{
	public static void main(String[] args) {
		int i,j;
		int A[][]=new int[3][3];
		int B[][]=new int[3][3];
		
		Scanner obj = new Scanner(System.in);

		// Matrix Input
			for(i=0;i<3;i++)
			for(j=0;j<3;j++)
{
	System.out.print("Enter Value of 1st Matrix= ");
	A[i][j]=obj.nextInt();
	
	}
// before
	System.out.print("\n---------Elements  of 1st Matrix-----\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(A[i][j]+" ");
			}
				System.out.print("\n");
			}
			System.out.print("\n---------------------------------\n");
		// transpose
			for(i=0;i<3;i++)
		
			for(j=0;j<3;j++)
			{
				B[j][i]=A[i][j];
			}

// after
			System.out.print("\n---------Elements  of Final Matrix After Transpose-----\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(B[i][j]+" ");
			}
				System.out.print("\n");
			}
			System.out.print("\n---------------------------------\n");
		}
	}

