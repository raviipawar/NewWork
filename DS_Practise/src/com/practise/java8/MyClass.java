package com.practise.java8;

public class MyClass {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		//myClass.sayBye();
		StaticExample.sayHello();
		
		StaticExample staticExample = () -> "Ravi";
		System.out.println(staticExample.getName());
	}

}