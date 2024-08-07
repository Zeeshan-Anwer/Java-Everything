package string_programmes;
public class Programme32 {
	public static String mirrorEnds(String string) {
		int count;
		int len = string.length();
		String result = "";
		String strInvert = "";
		for (int i = len - 1; i >= 0; i--) {
			strInvert += string.charAt(i);
		}
		for (count = 0; count < len; count++) {
			if (count < len && string.charAt(count) == strInvert.charAt(count))
				result += string.charAt(count);
			else
				break;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(mirrorEnds("abXYZba"));
		System.out.println(mirrorEnds("abca"));
		System.out.println(mirrorEnds("aba"));
		System.out.println(mirrorEnds(""));
		
	}
}
