package com.ashvinimadamproblems1;

import java.util.ArrayList;
import java.util.Arrays;

public class AdditionOfArrays {
	
	
	public static void main(String[] args) {
		
		String str1[]= { "ram", "rahul", "rohan"};
		
		String str2[]= { "rohit", "ramesh"};
		
		
		Arrays.asList(str1);
		
		Arrays.asList(str2);
		
		
		ArrayList<String> ArrayList= new ArrayList<String>(Arrays.asList(str1));
		
		ArrayList.addAll(Arrays.asList(str2));
		
		Object[] array = ArrayList.toArray();
		
		System.out.println(Arrays.toString(array));
		
		
		
		
	}

}
