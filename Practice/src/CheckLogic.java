
public class CheckLogic {

	public static void main(String[] args) {

		System.out.println(wildcard("aa", "*"));


		}

	public static boolean wildcard(String s, String p) {
		boolean ans;
		if (s.length() == 1 && p.length() == 1) {
			if (p.charAt(0) == '?') {
				ans = true;
			} else if (s.length() > 1 && p.length() == 1) {
				if (p.charAt(0) == '*') {
					ans = true;
				}
			} else
				ans = false;
		}
		return ans;
	}
	}
