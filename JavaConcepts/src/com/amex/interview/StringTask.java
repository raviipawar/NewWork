package com.amex.interview;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringTask {

	public static void main(String[] args) {

		String s = "ravindra";
		
//	Optional<Character> mostOccured = s.chars()
//					.mapToObj(c -> (char) c)
//					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//							.entrySet()
//							.stream()
//							.max(Map.Entry.comparingByValue())
//							.map(Map.Entry::getKey);
//					
//	
//	if(mostOccured.isPresent()) {
//		System.out.println("most occured "+ mostOccured.get());}
//	}
		
		Map<Character, Long> findfreq = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		long l1 = findfreq.values().stream().max(Long::compareTo).orElse(null);
		
		findfreq.entrySet()
		.stream()
		.filter(entry -> entry.getValue() ==l1)
		.forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
	
	}
	
}
