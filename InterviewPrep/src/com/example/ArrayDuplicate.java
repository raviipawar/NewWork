package com.example;

import java.util.HashMap;

public class ArrayDuplicate {
	
	public static boolean checkDuplicate(char[] ch) {
		char[] input = {'a', 'b', 'c', 'd', 'a', 'b', 'e'};

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : input) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Character key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + " is a duplicate character");
            }
        }
		
	}

	public static void main(String[] args) {
		
		char[] ch = {'a','b', 'c','c','d'};
		checkDuplicate(ch);
	}

}
