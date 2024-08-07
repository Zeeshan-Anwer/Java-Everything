package com.practice.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamImplements {

	public static void main(String[] args) {


		List<String> departmentList = new ArrayList<>();
		departmentList.add("Supply");
		departmentList.add("HR");
		departmentList.add("Sales");
		departmentList.add("Marketing");
		//map
		departmentList.stream().map(s -> s.toLowerCase()).forEach(System.out::println);
		//filter
		List<String> list=departmentList.stream().filter(word -> word.startsWith("H")).limit(10).collect(Collectors.toList());
		
		Stream<Integer> data = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(data.reduce(0, (a, b) -> a + b));
		
		Set<String> data1 = departmentList.stream().collect(Collectors.toSet());

		data1.forEach(System.out::println);
		groupingByStreams();

	}


	public static void groupingByStreams() {
		List<Product> productList = Arrays.asList(new Product("Jio", 12100), new Product("Chinese", 12000),
				new Product("Samsung", 3000),
				new Product("Jio", 5000));
		Map<String, List<Product>> grouping = productList.stream().collect(Collectors.groupingBy(Product::getName));
		System.out.println("The List of Product" + grouping);

		Map<Boolean, List<Product>> partition = productList.stream()
				.collect(Collectors.partitioningBy((Product) -> Product.getPrice() > 12000));
		Stream<Map> c = Stream.of(partition);
		System.out.println("partiotion" + partition);
		c.forEach(System.out::println);

	}
}
