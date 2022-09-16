package com.designfactory;

public class ElectronicsFactory {
	
	
	public static Electronics createPurchase(String input) {
		
		if(input.equalsIgnoreCase("M")) {
			
			return new Mobile(); }
		
		else if(input.equalsIgnoreCase("TV")) {
			
			return new TV(); }
		else 
			throw new IllegalArgumentException("Invalid Input");
		
			
		}
		
		
	}


