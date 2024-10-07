package com.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FiltersExample {

	// Given a list of integers, filter out the even numbers and double the result.
	public static void main11(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> result = numbers.stream().filter(num -> num % 2 == 0).map(num -> num * 2)
				.collect(Collectors.toList());
		System.out.println(result);
	}

	// Given a list of strings, filter out the strings starting with "A" and convert
	// them to uppercase.
	public static void main1(String[] args) {
		List<String> str = Arrays.asList("Anki", "Pinki", "ank");
		List<String> result = str.stream().filter(num -> num.startsWith("A") || num.startsWith("a"))
				.map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(result);
	}

	// Given a list of strings, filter out the strings containing the letter "e".
	public static void main3(String[] args) {
		List<String> str = Arrays.asList("Anki", "Pinki", "ankef");
		List<String> result = str.stream().filter(num -> num.contains("e") || num.contains("f"))
				.map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(result);
	}

	// Given a list of strings, map each string to its length.
	public static void main4(String[] args) {
		List<String> list = Arrays.asList("sss", "eerer", "reafasdf");
		List<Integer> result = list.stream().map(String::length).collect(Collectors.toList());
		System.out.println(result);
	}

	// Given a list of integers, filter out the prime numbers.
	public static void main5(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> result = numbers.stream().filter(FiltersExample::isPrime).collect(Collectors.toList());
		System.out.println(result);
	}

	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Given a list of Person objects, map each person to their age.
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Alice", 30), new Person("Bob", 25), new Person("Charlie", 35));
		List<Integer> ages = persons.stream().map(Person::getAge).collect(Collectors.toList());
		Optional<Integer> maxAge = persons.stream().map(Person::getAge).collect(Collectors.maxBy(Integer::compareTo));
		Optional<Person> personWithMaxAge = persons.stream()
				.collect(Collectors.maxBy((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge())));

		Optional<Person> personWithMinAge = persons.stream()
				.collect(Collectors.minBy((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge())));
		List<String> adultPersons = persons.stream().filter(person -> person.getAge() >=18)
				.map(Person::getName).sorted()
				.collect(Collectors.toList());
		
		System.out.println(personWithMinAge);
		System.out.println("Adult persons" +adultPersons);


		if (maxAge.isPresent() || personWithMaxAge.isPresent() || personWithMinAge.isPresent()) {
			System.out.println("max age " + maxAge.get());
			System.out.println("person with max age " + personWithMaxAge.get());
			System.out.println("person with min age " + personWithMinAge.get());
		} else {
			System.out.println("not found");
		}
		System.out.println(ages);
	}

	// Given a list of strings, filter out the strings containing the letter "a" and
	// map them to their uppercase versions.
	public static void main7(String[] args) {
		List<String> str = Arrays.asList("ravi", "anvi", "kavi", "sdfg", "dlgkhg");
		List<String> result = str.stream().filter(st -> st.contains("a")).map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(result);
	}

	// Given a list of integers, filter out the even numbers, square the result, and
	// then sum them up.
	public static void main8(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int result = numbers.stream().filter(num -> num % 2 == 0).mapToInt(num -> num * num).sum();
		System.out.println(result);
	}

	// Given a list of strings, convert each string to lowercase, filter out the
	// strings starting with "t", and then sort them alphabetically.

	public static void main6(String[] args) {
		List<String> str = Arrays.asList("aai", "anvi", "avi", "sdfg", "dlgkhg", "aaaai");
		List<String> result = str.stream().map(n -> n.toUpperCase()).filter(n -> n.startsWith("A")).sorted()
				.collect(Collectors.toList());
		System.out.println(result);
	}

	// Given a list of Person objects, filter out the adults (age >= 18), map them
	// to their names, and then sort them alphabetically.
}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
