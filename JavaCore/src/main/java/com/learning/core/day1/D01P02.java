package com.learning.core.day1;

public class D01P02 {


	// Interface to represent a drug manufactured by a pharmaceutical company
	interface MedicineInfo {
	    void displayLabel();
	}
	 
	// Implementing MedicineInfo interface with Tablet class
	class Tablet implements MedicineInfo {
	    @Override
	    public void displayLabel() {
	        System.out.println("Store Tablets in a cool dry place");
	    }
	}
	 
	// Implementing MedicineInfo interface with Syrup class
	class Syrup implements MedicineInfo {
	    @Override
	    public void displayLabel() {
	        System.out.println("Syrup in a non-returnable, recyclable container under prescription only");
	    }
	}
	 
	// Implementing MedicineInfo interface with Ointment class
	class Ointment implements MedicineInfo {
	    @Override
	    public void displayLabel() {
	        System.out.println("Ointment for external use only");
	    }
	}
	 
	// Test class
	public class TestClass {
	    public static void main(String[] args) {
	        // Declare Medicine instances
	        MedicineInfo tablet = new Tablet();
	        MedicineInfo syrup = new Syrup();
	        MedicineInfo ointment = new Ointment();
	 
	        // Check the polymorphic behavior of the displayLabel() method
	        tablet.displayLabel();
	        syrup.displayLabel();
	        ointment.displayLabel();
	    }
	}
}
