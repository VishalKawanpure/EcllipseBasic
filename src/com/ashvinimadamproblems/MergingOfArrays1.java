package com.ashvinimadamproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class MergingOfArrays1 {
	
	public static void main(String[] args) {
		
        String a[]= { "Ram", "Ramesh", "Rahul"};
		
		String b[]= { "Rohit", "Rohan"};
		
		
		Arrays.asList(a);
		
		ArrayList<String> list= new ArrayList<String>(Arrays.asList(a));
		
		list.addAll(Arrays.asList(b));
		
		Object[] c = list.toArray();
		
		System.out.println(Arrays.toString(c));
		
		
	}

}
