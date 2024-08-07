package string_programmes;
public class Programme28 {
	public static boolean equalIsNot(String str) {
		int countIs = 0;
		int countNot = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.length() >= i + 2 && str.substring(i, i + 2).equals("is"))
				countIs++;
			if (str.length() >= i + 3 && str.substring(i, i + 3).equals("not"))
				countNot++;
		}
		return countIs == countNot;
	}

	public static void main(String[] args) {
		System.out.println(equalIsNot("This is not"));
		System.out.println(equalIsNot("This is notnot"));
		System.out.println(equalIsNot("noisxxnotyynotxisi"));
	}
}
