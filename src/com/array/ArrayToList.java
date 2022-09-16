package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	
	public static void main(String[] args) {
		
		String s[]= {"Ram", "Rohan", "Ramesh"};
		
		List<String> list = Arrays.asList(s);
		
		List<String> list1 =new ArrayList<String>( list);
		
		list1.add("Rohit");
		
		
		for(String s1:list1) {
		
		
		System.out.println(s1);
		
		
	}

}}
