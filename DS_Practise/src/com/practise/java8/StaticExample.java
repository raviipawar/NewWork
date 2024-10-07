package com.practise.java8;

public interface StaticExample {
	
	String getName();
	static void sayHello() {
		System.out.println("hello");
	}

	default void sayBye() {
		System.out.println("say  bye");
	}
}
