package com.learning.core.day1;
import java.util.Scanner;

public class D01Array2 {

	 
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Create an integer array of 18 elements
	        int[] arr = new int[18];
	        
	        // Input values into the array
	        System.out.println("Enter 18 elements:");
	        for (int i = 0; i < 18; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        
	        // Compute the sum of elements from indices 1 to 14 and store it at element 15
	        int sum = 0;
	        for (int i = 1; i <= 14; i++) {
	            sum += arr[i];
	        }
	        arr[14] = sum;
	        
	        // Compute the average of all elements and store it at element 16
	        double average = 0;
	        for (int num : arr) {
	            average += num;
	        }
	        average /= arr.length;
	        arr[115] = (int) average;
	        
	        // Identify the smallest value from the array and store it at element 17
	        int min = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }
	        arr[16] = min;
	        
	        // Display the modified array
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}
	