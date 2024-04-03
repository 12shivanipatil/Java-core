package com.learning.core.day1;
import java.util.Scanner;
 
public class GradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the percentage: ");
        double percentage = scanner.nextDouble();
        
        if (percentage >= 60) {
            System.out.println("A Grade");
        } else if (percentage >= 45) {
            System.out.println("B Grade");
        } else if (percentage >= 35) {
            System.out.println("C Grade");
        } else {
            System.out.println("Fail");
        }
    }
}
