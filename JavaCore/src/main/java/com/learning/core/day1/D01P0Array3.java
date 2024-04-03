package com.learning.core.day1;
import java.util.HashMap;

public class D01P0Array3 {

	 
	
	    public static void main(String[] args) {
	        int[] arr = {10, 5, 3, 4, 3, 5, 6};
	        int n = arr.length;
	        
	        // Create a HashMap to store element frequencies and their indices
	        HashMap<Integer, Integer> map = new HashMap<>();
	        
	        int minIndex = n; // Initialize minIndex to maximum value
	        for (int i = 0; i < n; i++) {
	            if (map.containsKey(arr[i])) { // If the element is already present in the HashMap
	            	maxIndex = Math.min(minIndex, map.get(arr[i])); // Update minIndex if necessary
	            } else {
	                map.put(arr[i], i); // Otherwise, put the element and its index into the map
	            }
	        }
	        
	        // If minIndex remains equal to n, it means there are no repeating elements
	        if (maxIndex == n) {
	            System.out.println("No repeating element found.");
	        } else {
	            System.out.println("Index of the first repeating element: " + maxIndex);
	        }
	    }
	}

