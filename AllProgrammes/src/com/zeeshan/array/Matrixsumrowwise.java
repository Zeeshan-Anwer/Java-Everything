package com.zeeshan.array;
import java.util.Scanner;
class Matrixsumrowwise
{
	public static void main(String[] args) {
		{


	int i,j,z,sum=0,A[][];
	Scanner obj=new Scanner(System.in);
	A=new int[3][3];
// Matrix Element Input

	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
	{
		System.out.print("Enter Element of Matrix=");
		A[i][j]=obj.nextInt();
		}	
// Printing Element of Matrix
		System.out.print("-------\n Elements of Matrix You Entered-------\n");
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				
					System.out.print(A[i][j]+ " ");
				System.out.print("\n");
			}
			System.out.print("------------------------------------\n");

//Rowwise Sum Calculating
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
				sum=A[j][i]+sum;
				}	
			
				System.out.print("Sum Of ");
				z=i;
				System.out.print((++z)+" Row="+sum);
				System.out.print("\n");
				sum=0;
				
			}
	}
}
}