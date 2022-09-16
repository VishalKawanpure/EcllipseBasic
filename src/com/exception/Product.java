package com.exception;

public class Product {
	
	void productCheck(int weight)throws ProductException {
		
		if (weight <100) {
			
			throw new ProductException( "Weight is not ok");
		}
		else { System.out.println("weight= "+weight);}
		
		
	}

}
