package com.practise.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortComparator {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<>();
		ls.add(10);
		ls.add(11);
		ls.add(12);
		ls.add(13);
		Collections.sort(ls, (a, b) -> b - a);

		Set<Integer> s = new TreeSet<>((a, b) -> b - a);
		s.add(11);
		s.add(21);
		s.add(33);

		Map<Integer, String> map = new TreeMap<>((a, b) -> b - a);
		map.put(1, "a");
		map.put(2, "ah");
		map.put(3, "c");
		map.put(6, "d");
		System.out.println(map);
		System.out.println(s);
		System.out.println(ls);
		
		
		Student s1 = new Student(11, "ravi");
		Student s2 = new Student(21, "kavi");
		Student s3 = new Student(31, "pavi");
		Student s4 = new Student(41, "savi");
		
		List<Student> l1 = new ArrayList<Student>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		
		l1.sort(Comparator.comparingInt(Student::getAge));
		System.out.println(l1);
		
		l1.sort(Comparator.comparingInt(Student::getAge).reversed());
		System.out.println(l1);
		
		l1.sort(Comparator.comparing(Student::getName));
		System.out.println(l1);

		l1.sort(Comparator.comparing(Student::getName).reversed());
		System.out.println(l1);

	}
	

}
