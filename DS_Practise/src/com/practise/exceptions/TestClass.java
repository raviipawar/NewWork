package com.practise.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestClass {

	public static void getFile() throws IOException {
		File file = new File("abc.txt");
		FileInputStream stream = new FileInputStream(file);
	}

	public static void divideByZero() {
		throw new ArithmeticException("trying to divide by zero");
	}

}
