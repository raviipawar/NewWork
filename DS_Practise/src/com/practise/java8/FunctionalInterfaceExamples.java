package com.practise.java8;

@FunctionalInterface
public interface FunctionalInterfaceExamples {
	public void sayHello();

	default void sayBye() {
	};

	public static void sayOk() {
	};
}
