package com.learning.core.day1;

public class Main {


	    // Method to create a book
	    public static D01P01 createBook(String title, double price) {
	        return new D01P01(title, price);
	    }
	 
	    // Method to show book details
	    public static void showBooks(D01P01 book) {
	        System.out.println("Book Title: " + book.getTitle() + " and Price: " + book.getPrice());
	    }
	 
	    public static void main(String[] args) {
	        // Creating a book object
	    	D01P01 book = createBook("Java Programming", 350.00);
	 
	        // Showing book details
	        showBooks(book);
	    }
	}

