package com.practice.java8;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<Integer> isGreater = (i) -> i > 100;

		Predicate<Integer> isEven = (i) -> i % 2 == 0;

		System.out.println(isGreater.test(101));
		System.out.println(isEven.test(10));

		System.out.println(isEven.negate().test(10));
		System.out.println(isGreater.and(isEven).test(15));
		System.out.println(isGreater.or(isEven).test(76));
		Predicate<String> i = Predicate.isEqual("Zeeshan");
		System.out.println("Is Equal use:" + i.test("Zeeshan"));
	}

}