package com.string.concept;

public class ReverseStringRecursively {

	public static void main(String[] args) {
		String input = "abcdef";
		String output = reverseString(input);
		System.out.println("Here is the reversed string :" + output);
	}

	private static String reverseString(String input) {
		if (input.isEmpty()) {
			return input;
		}
		return reverseString(input.substring(1) + input.charAt(0));
	}
}
