package string_programmes;

import java.util.Scanner;

public class Programme21 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Any Word");
		String str1=sc.next();
	
		System.out.println("Enter Any Word");
		String str2=sc.next();
		
		int length=Math.min(str1.length(), str2.length());
		int i=0,count=0;
		while(i<length-1) {
			String ab=str1.substring(i,i+2);
			String ba=str2.substring(i,i+2);
			if(ab.equals(ba)){
				count++;
			}
		
			i++;
		}
		System.out.println(count);
	}

}
