package com.practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AmexInterview {

	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(6, 7, 8, 9,1);

		List<Integer> evenNumbers = Stream.concat(list.stream(), list2.stream()).filter(n -> n % 2 != 0).distinct()
				.collect(Collectors.toList());

		System.out.println("even numbers :" + evenNumbers);
	}
}


