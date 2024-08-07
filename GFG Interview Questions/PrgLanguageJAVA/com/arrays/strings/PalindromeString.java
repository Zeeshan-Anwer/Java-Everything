package com.arrays.strings;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int start=0;
		int end=s.length()-1;
		boolean isPal=true;
		while(start<end)
		{
			if(s.charAt(start)!=s.charAt(end)){
				isPal=false;
			break;
		}
		
		start++; end--;
		}
				if(isPal==true)
		System.out.println("Palindrome");
				else
					System.out.println("Not Palindrome");
	}
}
