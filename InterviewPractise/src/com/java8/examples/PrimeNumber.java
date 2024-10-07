package com.java8.examples;

public class PrimeNumber {

	public static void main(String[] args) {
		boolean op = checkPrime(234);
	}

	private static boolean checkPrime(int i) {
		if(i<=1) {
			System.out.println("neither prime nor composite");
		}
		else {
			int c =2;
			while (c*c<=i) {
				if(i%c==0) {
					System.out.println("not prime");
				}
				else c+=1;
			}
			System.out.println("given number is prime");
			return true;
		}
		return false;
	}
}




