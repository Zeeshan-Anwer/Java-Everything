package com.arrays.strings;
import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String f1=sc.nextLine();
		String f2="";
		int ptr=f1.length()-1;
		while(ptr>=0)
		{
			f2=f2+f1.charAt(ptr);
			ptr--;
		}
		System.out.println(f2);

	}

}
