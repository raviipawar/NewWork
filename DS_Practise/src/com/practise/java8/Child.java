package com.practise.java8;

class Child implements Parent {
	@Override
	public void sayHello() {
		System.out.println("Hiiiiiiiiiiii");
	}

	public static void main(String args[]) {
		Child c = new Child();
		c.sayHello();
	}
}
