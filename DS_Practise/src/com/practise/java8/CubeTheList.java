package com.practise.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CubeTheList {

	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(11,12,33,1, 2, 3, 4, 5);
		List<Integer> op = new ArrayList<>();
		op = ls.stream().map(n -> n * n * n).collect(Collectors.toList());
		System.out.println(op);
	}

}
