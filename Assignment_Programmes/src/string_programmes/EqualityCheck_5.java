package string_programmes;

import java.util.Scanner;

public class EqualityCheck_5 {
	
	static String word2;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First String");
		String word1=sc.next();
		//System.out.println("Enter Second String");
		//String word2;
	
		
		if(word1.equals(word2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal:");
		System.out.println(word2);

	}

}
