package com.practise.java8;

public class ReverseString {

	public static void main(String[] args) {
		String s1 = "ravindra";
		String reversed = reverseString(s1);
		System.out.println("reverse string :" + reversed);
	}

	private static String reverseString(String s1) {
		char[] ch = s1.toCharArray();
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
