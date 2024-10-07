package com.practise.java8;

public interface Parent {
	default void sayHello() {
		System.out.println("Hello");
	}
}

