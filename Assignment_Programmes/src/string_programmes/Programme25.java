package string_programmes;

public class Programme25 {
	public static void main(String[] args) {// Scanner sc=new Scanner(System.in);
// System.out.println("Enter String");
// String str=sc.next();
		String str = "fez day";
		int len = str.length();
		int count = 0;
		str = str.toLowerCase();
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {
				if (i < len - 1 && !Character.isLetter(str.charAt(i + 1)))
					count++;
				else if (i == len - 1)
					count++;
			}
		}
		System.out.println(count);
	}
}
