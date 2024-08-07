package com.practice.java8;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {

		Consumer<String> consume = (i) -> System.out.println("Your enter data is " + i);

		consume.accept("Zeeshan");
	}
}
