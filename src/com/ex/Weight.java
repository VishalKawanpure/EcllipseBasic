package com.ex;

public class Weight {
	
	void checkWeight(int weight) throws WeightException {
		
		if (weight >100) {
			
			throw new WeightException("You are overweight");
			
			
		}
	}

}
