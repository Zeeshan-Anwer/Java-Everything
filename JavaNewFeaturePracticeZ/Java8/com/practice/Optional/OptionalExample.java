package com.practice.Optional;

import java.util.Optional;

public class OptionalExample {



	public static void main(String args[]) {
		withJava8();
	}

	public static void beforeJava8() {
		String[] str = new String[10];
		String lowercaseString = str[5].toLowerCase();
		System.out.print(lowercaseString);
	}

	public static void withJava8() {
		String[] str = new String[10];
		str[5] = "Eazy Bytes";

		Optional<String> empty = Optional.empty();
		System.out.println("Calling emtpy method" + empty);

		Optional<String> of = Optional.of(str[5]);
		System.out.println("Calling of " + of);

		Optional<String> ofNullable = Optional.ofNullable(str[4]);
		/*
		 * // System.out.println("calling ifpresent" + //
		 * ofNullable.ifPresent(System.out::println));
		 */
		System.out.println("Calling Nullabe with null" + ofNullable);


}
}
