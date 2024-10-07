package com.string.concept;

public class ReverseString {

	public static void main(String[] args) {
		String input = "abcdef";
		String output = reverseString(input);
		System.out.println("Here is the reversed string :" + output);
	}

	private static String reverseString(String input) {
		char[] ch = input.toCharArray();
		int left = 0;
		int right = ch.length - 1;

		while (left < right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;

			left++;
			right--;
		}
		return new String(ch);
	}
}
