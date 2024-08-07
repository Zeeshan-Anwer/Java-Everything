package com.practice.Lambda;
public class LambdaExample {

	public static void main(String[] args) {

		VoidMethodWithNoParameter ref1 = () -> System.out.println("ref1");
		VoidMethodWithNoParameter ref2 = () -> System.out.println("ref2");
		
		ref1.printName();
		ref1.printName();

		VoidMethodWithOneParam p1 = (name) -> System.out.println(name);
		p1.print("Zeeshan");

		VoidMethodWithTwoParam p2 = (a, b) -> System.out.print(a + b);
		p2.twoParam("ze", "d");

		ReturnMethodWithTwoParam r1 = (a, b) -> {
			return a + b;
		};

		ReturnMethodWithTwoParam r2 = (a, b) -> {
			return a * b;
		};
		System.out.println(r1.calculateAndReturn(10, 16));
		System.out.println(r1.calculateAndReturn(1054, 342));
		System.out.println("Square of no " + r1.calculateAndReturn(34, 34));
	}
}

//
//private static void voidMethodWithOneParam() {
//	VoidMethodWithOneParam method = (input) -> {
//		System.out.println(input);
//	};
//
//	VoidMethodWithOneParam method1 = (input) -> System.out.println(input.toLowerCase());
//
//	VoidMethodWithOneParam method2 = input -> System.out.println(input.toUpperCase());
//
//	method.printInput("Hello");
//	method1.printInput("Eazy Bytes");
//	method2.printInput("Welcome");
//
//}