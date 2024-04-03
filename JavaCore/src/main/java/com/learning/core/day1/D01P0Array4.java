package com.learning.core.day1;
import java.util.List;
import java.util.ArrayList;

public class D01P0Array4 {

	 

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3};
	        int k = 2;
	        List<List<Integer>> combinations = findCombinations(arr, k);
	        for (List<Integer> combination : combinations) {
	            System.out.println(combination);
	        }
	    }
	 
	    public static List<List<Integer>> findCombinations(int[] arr, int k) {
	        List<List<Integer>> result = new ArrayList<>();
	        List<Integer> current = new ArrayList<>();
	        backtrack(result, current, arr, k, 0);
	        return result;
	    }
	 
	    private static void backtrack(List<List<Integer>> result, List<Integer> current, int[] arr, int k, int start) {
	        if (current.size() == k) {
	            result.add(new ArrayList<>(current));
	            return;
	        }
	        for (int i = start; i < arr.length; i++) {
	            current.add(arr[i]);
	            backtrack(result, current, arr, k, i + 1);
	            current.remove(current.size() - 1);
	        }
	    }
	}

