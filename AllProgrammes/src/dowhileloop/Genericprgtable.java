package dowhileloop;

import java.util.Scanner;
class Genericprgtable
{
	public static void main(String args[])
	{
		int num;
		char hi;
		do
		{
		Scanner obj;
		obj= new Scanner(System.in);
		System.out.print("enter a number to print table: ");
		num=obj.nextInt();
		for(int i=1;i<=10;i++)
			System.out.println((num*i));
		
		obj= new Scanner(System.in);
		System.out.println("Enter 'y' to continue");
		hi=obj.next().charAt(0);
		}
		while(hi=='y');
		
	}
}