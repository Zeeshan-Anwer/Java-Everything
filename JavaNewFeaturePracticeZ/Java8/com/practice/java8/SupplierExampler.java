package com.practice.java8;

import java.util.function.Supplier;

public class SupplierExampler {

	public static void main(String[] args) {

		Supplier<Integer> T = () -> 3;
		System.out.println(T.get());

	}
}

//Creating a Supplier
// Supplier<Integer> getCurrDayOfMonth = () -> LocalDate.now().getDayOfMonth();
