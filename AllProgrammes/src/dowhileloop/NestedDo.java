package dowhileloop;

import java.util.Scanner;
class NestedDo
{
	public static void main(String args[])
	{
		int a=1,b=2;
		do{
			System.out.println(a);
			do
			{
				System.out.println(a+b);
				
			}
			while(a==2);
			System.out.println(b);
		}
			while(b==1);
}}
			