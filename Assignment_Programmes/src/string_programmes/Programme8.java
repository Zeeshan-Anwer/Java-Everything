package string_programmes;

import java.util.Scanner;

public class Programme8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String s = scan.nextLine().toLowerCase();
		char[] cs = s.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			int count = 0;
			for (int j = 0; j < cs.length; j++) {
				if (j < i && cs[j] == cs[i]) { // to not print repeated words
					break;
				}
				if (cs[i] == cs[j]) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println(cs[i] + " " + "is" + count);
			}
		}
	}
}
