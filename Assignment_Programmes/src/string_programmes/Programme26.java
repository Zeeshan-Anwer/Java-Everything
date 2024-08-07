package string_programmes;

import java.util.Scanner;

public class Programme26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String");
		String word1=sc.nextLine();
		System.out.println("Enter to remove");
		String input=sc.next();
		word1=word1.replaceAll(input, "llo");
		System.out.println(word1);
	}

}
e