package com.example.basics;

public class CheckPrime {

	public static void main(String[] args) {
		int n = 11;
		boolean answer = checkPrime(n);
		//System.out.println("Given number "+n+ "is not prime");
	}

	private static boolean checkPrime(int n) {
		if(n <=1) {
			System.out.println("Given number is prime");
		}
		int c =2;
		while(c*c <=n) {
			if(n%c==0) {
				System.out.println("given number is not prime");
				return false;
			}
			c =c+1;
		}
		System.out.println("given number is prime");
		return true;
	}
}
