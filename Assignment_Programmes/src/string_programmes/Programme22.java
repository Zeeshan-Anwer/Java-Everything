package string_programmes;

import java.util.Scanner;

public class Programme22 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String");
		String word1=sc.next();

		char FirstChar=word1.charAt(0);
		char LastChar=word1.charAt(word1.length()-1);
	
		String word2=word1.substring(1, word1.length()-1);
		
		word2=word2.replaceAll("x","");
		
		word1=FirstChar+word2+LastChar;
		System.out.println("After removing x from middle: "+word1);
	}

}
