package com.practise.java8;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Examples {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(1, 2, 3, 2, 3, 4, 5, 6, 7, 8, 9, 11);
		List<Integer> outputEven = findEvenNumbers(input);
		List<Integer> outputOdd = findOddNumbers(input);
		List<Integer> removeDuplicates = removeDuplicateNumbers(input);

		String s1 = "ravindra";
		List<int[]> op = findFrequency(s1);
		
		List<String> names = Arrays.asList("rohit", "urmila", "rohit", "urmila", "ram", "sham", "sita", "gita");
		findWordfrequency(names);

	}

	private static void findWordfrequency(List<String> names) {
		Map<String, Long> op = names.stream().collect(groupingBy(Function.identity(),counting()));
		System.out.println(op);
	}

	private static List<Integer> removeDuplicateNumbers(List<Integer> input) {
		List<Integer> removeDuplicates = input.stream().distinct().collect(Collectors.toList());
		System.out.println("Non Duplicates Numbers " + Arrays.toString(removeDuplicates.toArray()));
		return null;
	}

	private static List<Integer> findEvenNumbers(List<Integer> input) {
		List<Integer> outputEven = input.stream().filter(n -> n % 2 == 0).distinct().collect(Collectors.toList());
		System.out.println("Even Numbers " + Arrays.toString(outputEven.toArray()));
		return outputEven;
	}

	private static List<Integer> findOddNumbers(List<Integer> input) {
		List<Integer> outputOdd = input.stream().filter(n -> n % 2 != 0).distinct().collect(Collectors.toList());
		System.out.println("Odd Numbers " + Arrays.toString(outputOdd.toArray()));
		return outputOdd;
	}

	private static List<int[]> findFrequency(String s1) {
		Map<String, Long> output = Arrays.stream(s1.split("")).collect(groupingBy(Function.identity(), counting()));
		System.out.println("nnnnnnn"+output);
		return null;
	}
	
}
