package com.designfactory;

public class Bookfact {
	
	
	public static Book createBook(String input) {
		
		if(input.equalsIgnoreCase("1")) {
			
			return new T1();
		}
		
		else if(input.equalsIgnoreCase("2")) {
			return new T2();
		}
		
		else 
			throw new IllegalArgumentException("Not valid");
	}

}
