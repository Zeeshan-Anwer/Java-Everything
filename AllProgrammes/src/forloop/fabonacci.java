package forloop;

import java.util.Scanner;
class fabonacci
{
	public static void main(String args[]) 
	{
		int a=0,b=1,c=0,n,i;
		Scanner obj =new Scanner (System.in);
		System.out.print("\nEnter the value of sequence=\t");
		n=obj.nextInt();
		System.out.print(a+" "+b);
		for(i=1;i<n-2;i++)
		{
			c=a+b;
			System.out.print(c+" ");
		a=b;
		b=c;
		}
	}
}