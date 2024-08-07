package allPractice.java8;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {

		LambdaCheck c = (a, b) -> {
			return a + b;
		};
		System.out.println(c.addition(15, 30));

		String s[] = new String[5];
		s[0] = "Hello";
		Optional<String> val = Optional.ofNullable(s[1]);
		System.out.println(val);
	}

}
