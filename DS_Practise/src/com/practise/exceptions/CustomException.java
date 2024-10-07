package com.practise.exceptions;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary ");

		try {
			int salary = sc.nextInt();
			if (salary > 10000) {
				throw new MyException("Salary is high");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

class MyException extends Exception {

	public MyException(String message) {
		super(message);
	}
}
