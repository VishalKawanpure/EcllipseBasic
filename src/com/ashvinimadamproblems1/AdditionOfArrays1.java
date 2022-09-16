package com.ashvinimadamproblems1;

import java.util.ArrayList;
import java.util.Arrays;

public class AdditionOfArrays1 {

	public static void main(String[] args) {

		String str1[] = { "ram", "rahul", "rohan" };

		String str2[] = { "rohit", "ramesh" };
		
		
		Arrays.asList(str1);
		Arrays.asList(str2);
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(str1));
		
		list.addAll(Arrays.asList(str2));
		
		Object[] array = list.toArray();
		
		
		for(Object s:array) {
			
			System.out.println(s);
			
		}
		System.out.println(Arrays.toString(array));
		
		

	}

}
