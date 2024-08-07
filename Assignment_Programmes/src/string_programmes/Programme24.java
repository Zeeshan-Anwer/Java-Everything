package string_programmes;

import java.util.Scanner;

public class Programme24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String");
		String word1=sc.next();

		word1=word1.replaceAll("yak", "");
		System.out.println(word1);
	}

}
