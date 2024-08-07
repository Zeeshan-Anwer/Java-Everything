package string_programmes;

import java.util.Scanner;

public class Programme12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String:");
		String str = scan.nextLine();
		StringBuffer strb = new StringBuffer(str);
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isLowerCase(ch)) {
				strb.setCharAt(i, Character.toUpperCase(ch));
			}
			if (Character.isUpperCase(ch)) {
				strb.setCharAt(i, Character.toLowerCase(ch));
			}
		}
		System.out.println(strb);
	}
}