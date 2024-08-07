package com.practice.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SimpleStreamExample {

	public static void main(String[] args) {

		List<String> departmentList = new ArrayList<>();
		departmentList.add("Supply");
		departmentList.add("HR");
		departmentList.add("Sales");
		departmentList.add("Marketing");

		Stream<String> emptyStream = Stream.empty();
		emptyStream.forEach(System.out::println);

		Stream<Integer> data = Stream.of(10, 20);
		data.forEach(System.out::println);

		Stream<String> notParallel = departmentList.stream();
		notParallel.forEach(System.out::println);

		Stream<String> parallelStream = departmentList.parallelStream();
		parallelStream.forEach(System.out::println);
	}

}
