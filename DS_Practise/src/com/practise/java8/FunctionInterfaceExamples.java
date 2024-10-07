package com.practise.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceExamples {

	public static void main(String[] args) {

		Function<String, Integer> function = x -> x.length();
		Function<String, String> function2 = x -> x.substring(0, 3);
		Function<String, String> function3 = x -> x.toUpperCase();

		Function<List<Student>, List<Student>> function3NameWithRAV = list -> {
			List<Student> op = new ArrayList<>();
			for (Student s : list) {
				if (function2.apply(s.getName()).equalsIgnoreCase("Rav")) {
					op.add(s);
				}
			}
			return op;

		};

		String s1 = "Ravindra";
		function.apply(s1);
		System.out.println(function.apply(s1));
		System.out.println(function2.apply(s1));

		System.out.println(function2.andThen(function3).apply(s1));

		Student s11 = new Student(0, "Ravindra");
		Student s2 = new Student(0, "Raavindra");
		Student s3 = new Student(0, "Rvindra");
		List<Student> student = Arrays.asList(s11, s2, s3);
		List<Student> output = function3NameWithRAV.apply(student);
		System.out.println(output);

		Function<Integer, Integer> function4 = x -> 2 * x;
		Function<Integer, Integer> function5 = x -> x * x * x;

		System.out.println(function4.apply(2));
		System.out.println(function5.apply(2));

		System.out.println(function4.andThen(function5).apply(2)); // 64
		System.out.println(function5.andThen(function4).apply(2)); // 16

		System.out.println(function5.compose(function4).apply(2)); // 16

	}
}
