package string_programmes;

public class Programme20 {
	public static void main(String[] args) {
		String str = "axxxaaxx";
		if (str.length() < 2)
			System.out.println(0);
		String end = str.substring(str.length() - 2);
		int count = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			String sub = str.substring(i, i + 2);
			if (sub.equals(end)) {
				count++;
			}
		}
		System.out.println(str + ", " + count);
	}
}
