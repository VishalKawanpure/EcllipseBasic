package com.exception;

public class Weight {

	 void weightCheck(int weight) throws WeightException {
		
		if (weight >100 || weight <45) {
			
			throw new WeightException("Your weight is not ok");
			
		}
		
		else {System.out.println("You are fit because your weight is..."+ weight);}
		
		
	}

	
	
}
