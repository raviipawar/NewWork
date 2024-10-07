package com.practise.java8;

interface A {
	default void sayHello() {
		System.out.println("From A");
	}
}

interface B {
	default void sayHello() {
		System.out.println("From B");
	}
}

public class Demo implements A, B {

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.sayHello();

	}

	@Override
	public void sayHello() {
		B.super.sayHello();
	}

}
