package com.ashvinimadamproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergingOfArrays {
	
	public static void main(String[] args) {
		
		String a[]= { "Ram", "Ramesh", "Rahul"};
		
		String b[]= { "Rohit", "Rohan"};
		
		Arrays.asList(a);
		
		List<String> list= new ArrayList<String> (Arrays.asList(a));
		
		list.addAll((Arrays.asList(b)));
		
		Object[] c = list.toArray();
		
		System.out.println(Arrays.toString(c));
		
		
	}

}
