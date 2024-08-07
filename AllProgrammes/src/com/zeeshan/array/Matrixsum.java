package com.zeeshan.array;

import java.io.*;
class matrixsum
{
	public static void main(String args[]) throws IOException
	{
		int i,j=0,sum=0;
		DataInputStream z =new DataInputStream(System.in);
		int A[][]=new int [3][3];
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			{
				System.out.print("Enter a no: ");
				A[i][j]=Integer.parseInt(z.readLine());
			}
			System.out.print("---Elements of 3*3 Array----");
			for(i=0;i<3;i++)
			{
				for(i=0;j<3;j++)
				{
					System.out.print(sum);
					System.out.print("\n");
					sum=0;
				}
			}
	}
					
}