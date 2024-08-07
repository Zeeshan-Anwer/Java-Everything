package string_programmes;

import java.util.Scanner;

public class AllVowelsFrequency_11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Sentence");
		String str = sc.nextLine();
		sc.close();
		String str2 = str.toLowerCase();
// str2.toLowerCase();
		int[] count = new int[5];
		for (int i = 0; i < str.length(); i++) {
			char ch = str2.charAt(i);

			if (ch == 'a') {
				count[0]++;
			} else if (ch == 'e') {
				count[1]++;

			} else if (ch == 'i') {
				count[2]++;
			} else if (ch == 'o') {
				count[3]++;
			} else if (ch == 'u') {
				count[4]++;
			}
		}
		System.out.println("count of a = " + count[0]);
		System.out.println("count of e = " + count[1]);
		System.out.println("count of i = " + count[2]);
		System.out.println("count of o = " + count[3]);
		System.out.println("count of u = " + count[4]);

	}
}