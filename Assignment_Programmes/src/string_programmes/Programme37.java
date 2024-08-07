
package string_programmes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Programme37 {
	public static void main(String[] args) {
		String word = "ab2ccccd";
		String encoding = "";
		char[] cs = word.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			int count = 1;
			for (int j = i + 1; j < cs.length; j++) {
				if (cs[i] == cs[j]) {
					count++;
				} else
					break;
			}
			if (count > 1) {
				encoding += "" + count + cs[i];
			} else
				encoding += cs[i];
			i += count - 1;
		}
		System.out.println(encoding);
	}
}
