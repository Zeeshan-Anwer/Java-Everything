package allPractice.java8;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaImplementation {

	public static void main(String[] args) {
		
		LambdaExample ref = (a, b) -> {
			return "ref1";
		};
		ref.getdata(10, 15);

		String s[] = new String[10];
		s[5] = "hi";

		Optional<String> d1 = Optional.ofNullable(s[3]);
		System.out.println(d1);

		// () -> System.out.println("ref1");
		Predicate<Integer> isEqual = (i) -> (i == 5);
		Predicate<Integer> isGreater = (i) -> i > 8;
		System.out.println("Predicate");


		UnaryOperator<Integer> f1 = (i) -> {
			return i * i;
		};
		System.out.println("unaryoperator" + f1.apply(5));

		BinaryOperator<String> str = (i, j) -> {
			return i + j;
		};

		Function<Integer, String> f2 = (i) -> {
			return "String representation";
		};
		System.out.println("unaryoperator" + f2.apply(5));

		BiFunction<Integer, Integer, String> bi = (i, j) -> {
			System.out.println("here 2 data accetpted");
			return "2 data";
		};

		Consumer<Integer> con = (i) -> System.out.println("Consumer");
		con.accept(5);

		BiConsumer<Integer, String> bicon = (i, j) -> {
			System.out.println(i);
			System.out.println(j);
		};
		bicon.accept(5, null);

		Supplier<String> supply = () -> {
			return "Zeeshan";
		};
		supply.get();

		LambdaImplementation l = new LambdaImplementation();

		MethodRefrence r = l::streamPractice;
		r.getName();



	}

	public void streamPractice() {
		System.out.println("Zeesahn");

		List<String> al = new LinkedList();
		al.add("Hell");
		al.add("Bye");

		Stream<List<String>> str = Stream.of(al);
		Stream.empty();
		al.stream();

		Integer[] arr = { 1, 2, 3, 4, 5, 6 };
		Arrays.stream(arr);


		// map :- to perform any logic on each obj
		Long ar = Arrays.stream(arr).parallel().map(i -> i * i).filter(i -> i % 2 == 0).skip(0).limit(10)
				.collect(Collectors.counting());
		System.out.println(ar);



	}




}
