package com.arraylist;

import java.util.Arrays;

public class SortingArray1 {
	
	public static void main(String[] args) {
		
		String baloon[]= { "Red", "Blue", "Green", "Red","Blue","Red", "Blue", "Green"};
		
		
		Arrays.sort(baloon);
		
		for (String sort: baloon) {
			System.out.println(sort);
		}
		
		
	}

}
