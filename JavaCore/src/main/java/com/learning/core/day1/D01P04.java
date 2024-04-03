package com.learning.core.day1;
import java.util.Scanner;

public class D01P04 {

	
	 
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Accept two numbers from the user
	        System.out.println("Enter two numbers in the range from 1 to 40:");
	        int number1 = scanner.nextInt();
	        int number2 = scanner.nextInt();
	        
	        // Single dimension array with five integer elements ranging in value from 1 to 40
	        int[] numbers = {7, 25, 5, 19, 30};
	        
	        // Check if both inputted numbers are found in the array
	        boolean foundNumber1 = false;
	        boolean foundNumber2 = false;
	        for (int num : numbers) {
	            if (num == number1) {
	                foundNumber1 = true;
	            }
	            if (num == number2) {
	                foundNumber2 = true;
	            }
	        }
	        
	        // Display the message based on the comparison result
	        if (foundNumber1 && foundNumber2) {
	            System.out.println("Both numbers are found in the array.");
	        } else {
	            System.out.println("At least one of the numbers is not found in the array.");
	        }
	    }
}
	
	
