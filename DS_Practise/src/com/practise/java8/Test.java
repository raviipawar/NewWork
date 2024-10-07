package com.practise.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

//
//print 1 to 100 and tell if it say if it divisible by 3 , 5 and 7
//1 -
//2
//3 - 3
//4 -
//5 - 5
//15 - 3 , 5
//21 - 3 , 7
public class Test {

	public static void main(String[] args) {

//			if (n % 3 == 0) {
//				result.append("3");
//				isDivisible = true;
//			}
//
//			if (n % 5 == 0) {
//				result.append("5");
//				isDivisible = true;
//			}
//			if (n % 7 == 0) {
//				result.append("7");
//				isDivisible = true;
//			}
//			if (isDivisible) {
//				System.out.println(result);
//			}
//			else
//			{
//				System.out.println(n + " is not divisible by 3,5,7");
//			}
//		});

		List<Integer> divisors = Arrays.asList(3, 5, 7, 9);
		IntStream.range(3, 101).forEach(n -> {
			StringBuilder result = new StringBuilder(n + " is divisble by ::");
			boolean isDivisible = false;

			for (Integer integer : divisors) {
				if (n % integer == 0) {
					if (isDivisible)
						result.append(", ");
					result.append(integer);
					isDivisible = true;
				}
			}

			if (isDivisible) {
				System.out.println(result);
			} else {
				System.out.println(n + " is not divisible by " + divisors);
			}
		});

	}
}
