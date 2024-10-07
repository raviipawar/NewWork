package com.example.arrays;

import java.util.Arrays;

public class ArrayBasics {

	public static void main(String[] args) {
//		int[] rollNo1 = new int[3];
//		int[] rollNo11 = {1,2,3};
//		//System.out.println(rollNo1);
//		for (int i : rollNo1) {
//			System.out.println(i);
//		}
//		
//		String[] arr = new String[4];
//		for (String string : arr) {
//			System.out.println(string);
//		}
//		
//		for (int i1 : rollNo11) {
//			System.out.println(i1);
//		}
//		
//		System.out.println(Arrays.toString(rollNo1));
//		System.out.println(Arrays.toString(rollNo11));

		//passing an array in function
		String[] str = {"aa","bb","cc"};
		System.out.println(Arrays.toString(str));
		changeValue(str);
		System.out.println("Changed array  " +Arrays.toString(str));
	}
	
	static void changeValue(String[] st) {
		st[0]="pp";
	}
}
