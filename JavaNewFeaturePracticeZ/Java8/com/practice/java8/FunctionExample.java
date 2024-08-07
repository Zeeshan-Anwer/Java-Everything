package com.practice.java8;

import java.util.function.UnaryOperator;

public class FunctionExample {

	public static void main(String[] args) {

		UnaryOperator<String> data = (i) -> i;

		System.out.println(data.apply("hi"));
	}
}
//}Function<Integer, Integer> multiplyOperation = a -> {
//	System.out.println("Double Operation");
//	return a * 2;
//};
//
//// Chaining the function methods using andThen()
//multiplyOperation = multiplyOperation.andThen(a -> {
//	System.out.println("Triple Operation");
//	return 3 * a;
//});