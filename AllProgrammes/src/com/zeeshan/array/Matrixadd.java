package com.zeeshan.array;

import java.util.Scanner;
class Matrixadd
{
	public static void main(String[] args) {
		int i,j;
		int A[][]=new int[3][3];
		int B[][]=new int[3][3];
		int C[][]=new int[3][3];
		Scanner obj = new Scanner(System.in);

		//1st Matrix Input
			for(i=0;i<3;i++)
			for(j=0;j<3;j++)
{
	System.out.print("Enter Value of 1st Matrix= ");
	A[i][j]=obj.nextInt();
	}

	//Print 1st Matrix
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
	// 2nd Matrix
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
{
	System.out.print("Enter Value of 2nd Matrix= ");
	B[i][j]=obj.nextInt();
	}
	//Print 2nd Matrix
		System.out.print("\n---------Elements  of 2nd Matrix-----\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(B[i][j]+" ");
			}
				System.out.print("\n");
			}
			System.out.print("\n----------------------------------\n");

	//Addition of 1st & 2nd Matrix
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
		{
			C[i][j]=A[i][j]+B[i][j];

		}
		//Print Final Matrix
		System.out.print("\n---------After Addition Final Value of Matrix-----\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(C[i][j]+" ");
			}
				System.out.print("\n");
			}
			System.out.print("\n----------------------------------------------\n");
}
} 	