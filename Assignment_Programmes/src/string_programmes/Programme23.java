package string_programmes;

import java.util.Scanner;

public class Programme23 {
	public static void main(String[] args) {
		String str = "Chole";
		String result = "";
		for (int i = 0; i < str.length(); i += 4) {
			int end = i + 2;
			if (end > str.length()) {
				end = str.length();
			}
			result = result + str.substring(i, end);
		}
		System.out.println(result);
	}
}
