package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class TwoNumberSum {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 11 };
		int targetSum = 7;
		List<int[]> pairs = findPairs(array, targetSum);
		List<int[]> pairsUsingLoop = findPairsUsingLoop(array, targetSum);
		List<int[]> pairUsingSet = findPairsUsingSet(array, targetSum);
		for (int[] i : pairs) {
			System.out.println("Output using for loop :: "+i[0] + "  " + i[1]);
		}
		
		for (int[] i : pairUsingSet) {
			System.out.println("Output using set :: "+i[0] + "  " + i[1]);
		}
		
		for (int[] i : pairsUsingLoop) {
			System.out.println("Output using Loop :: "+i[0] + "  " + i[1]);
		}
	}

	private static List<int[]> findPairsUsingLoop(int[] array, int targetSum) {
		Arrays.sort(array);
		List<int[]> pairs = new ArrayList<>();
		int left = 0;
		int right = array.length -1;
		while (left < right) {
			int currentSum = array[left] + array[right];
			if( currentSum == targetSum) {
				pairs.add(new int[] {array[left] ,  array[right]});
			} else if (currentSum < targetSum) {
				left++;
			} else {
				right--;
			}
		}
		return pairs;
	}

	//TC will be o(n)
	//Optimzed approach
	private static List<int[]> findPairsUsingSet(int[] array, int targetSum) {
		List<int[]> pairs = new ArrayList<>();
		HashSet<Integer> hset = new HashSet<>();
		
		for(int num: array) {
			int complement = targetSum - num;
			if(hset.contains(complement)) {
				pairs.add(new int[] {complement,num});
			}
			hset.add(num);
		}
		return pairs;
	}

	//TC will be o(n*n)
	//Brute force approach
	private static List<int[]> findPairs(int[] array, int targetSum) {
		List<int[]> pairs = new ArrayList<>();
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				if (array[i] + array[j]== targetSum) {
					pairs.add(new int[] { array[i] , array[j] });
				}
			}
		}
		return pairs;
	}
}


