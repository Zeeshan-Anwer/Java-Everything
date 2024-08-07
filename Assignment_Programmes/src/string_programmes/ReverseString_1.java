package string_programmes;

import java.util.Scanner;

public class ReverseString_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Any Word");
		String word=sc.next();
		String reverseWord="";
		int i=word.length()-1;
		
		while(i>=0){
			
			reverseWord=reverseWord+word.charAt(i);
			i--;
		}
		System.out.println("Reverse is:"+reverseWord);	
	}
	

}
