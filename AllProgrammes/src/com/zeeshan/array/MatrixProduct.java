package com.zeeshan.array;

import java.io.*;
class Matrixproduct
{
public static void main(String args[])throws IOException
{
int i,j,k;
DataInputStream z=new DataInputStream (System.in);
int A[][]=new int[3][3];
int B[][]=new int[3][3];
int C[][]=new int[3][3];
System.out.println("input in first matrix");
for(i=0;i<3;i++)
for(j=0;j<3;j++)
{
System.out.println("enter values of 1st matrix ");
A[i][j]=Integer.parseInt(z.readLine());
}
System.out.println("elements of 2nd matrix");
for(i=0;i<3;i++)
for(j=0;j<3;j++)
{
System.out.println("enter values of 2nd matrix ");
B[i][j]=Integer.parseInt(z.readLine());
}
System.out.println("calculating a*b ");
for(i=0;i<3;i++)
for(j=0;j<3;j++)
{
C[i][j]=0;
for(k=0;k<3;k++)
C[i][j]=C[i][j]+A[i][j]*B[k][j];
System.out.println("printing matrix c");
System.out.println("--elements of matrix c--");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.println(C[i][j]);
System.out.print("\n");
}
}
}
}
}