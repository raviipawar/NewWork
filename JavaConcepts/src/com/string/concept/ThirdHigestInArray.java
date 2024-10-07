package com.string.concept;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ThirdHigestInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 11, 22, 212, 22, 4, 3, 5, 6 };
		Optional<Integer> thirdHigest = findThirdHighest(arr);
		System.out.println("Third highest element is " + thirdHigest);

	}

	private static Optional<Integer> findThirdHighest(int[] arr) {
		List<Integer> topThree = Arrays.stream(arr)
				.distinct()
				.boxed()
				.sorted(Comparator.reverseOrder())
				.limit(3)
				.collect(Collectors.toList());
		if (topThree.size() == 3)
			return Optional.of(topThree.get(2));
		else
			return Optional.empty();
	}

}
