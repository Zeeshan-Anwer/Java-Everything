/*
  Write a java program to reverse a String without using reverse() method.

Input : tekleads
Output: sdaelket
 */
package assigment.Strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your text: ");
		String input=sc.nextLine();
	//	System.out.println(input.length());
	//	System.out.println(input.charAt(7));
		System.out.print("Reverse output: ");
		System.out.println(getReverse(input));
		
		
	}
	public static String getReverse(String data)
	{
		String rev=" ";
		for(int i=data.length()-1;i>=0;i--)
		{
	//		System.out.println("value of i"+i);
			rev=rev+data.charAt(i);
		}
		return rev;
	}
	

}
