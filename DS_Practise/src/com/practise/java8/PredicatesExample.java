package com.practise.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class PredicatesExample {

	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Predicate<Integer> salary = x -> x >10000;
		Predicate<Integer> isEven = x -> x %2 ==0;
		int ls1 =ls.stream().filter(x -> x%2 == 0).mapToInt(n->n).sum();
		
		List<Integer> ls2 = Arrays.asList(1,2,3,4,5,6,7,8,9);
		for (Integer integer : ls2) {
			if(isEven.test(integer))
			System.out.println(integer);
		}
		
		
		Predicate<String> startsWithLetterR = x -> x.charAt(0)== 'r';
		String s1 = "KavindrK";
		System.out.println(startsWithLetterR.test(s1));
		System.out.println(ls1);
		System.out.println(salary.test(100000000));
		
		Predicate<String> endssWithLetterA = x -> x.charAt(x.length()-1)== 'a';
		Predicate<String> and = startsWithLetterR.and(endssWithLetterA);
		System.out.println(and.test(s1));
		
		Predicate<String> or = startsWithLetterR.or(endssWithLetterA);
		System.out.println(or.test(s1));


		
		
	}
}
