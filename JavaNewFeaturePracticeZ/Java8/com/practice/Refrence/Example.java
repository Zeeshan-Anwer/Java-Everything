package com.practice.Refrence;

import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
//Old model
		ArithmaticOperation opt = (a, b) -> {
			return a + b;
		};
		System.out.println(opt.sum(10, 15));
		Example ex = new Example();
		// instanceMethodrefrence::
		ArithmaticOperation refrence = ex::sum;
		System.out.println("Objrefrecne::instanceMethod" + refrence.sum(10, 16));

		ArithmaticOperation ref = Example::sum1;
		System.out.println("Class::StaticMethod" + ref.sum(15, 3));

		ArrayList<String> al = new ArrayList<>();

		al.add("Software");
		al.add("Hardware");
		al.add("Nullable");
		al.add("Product");
		System.out.println("old method");
		al.forEach((s) -> System.out.println(s));
		System.out.println("new method");
		al.forEach(System.out::println);


	}

	public int sum(int a, int b) {
		return a + b;
	}

	public static int sum1(int a, int b) {
		return a + b;
	}

}
