package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Add {
	
	public static void main(String[] args) {
		
		String s1[]= { "Ram", "Rohan"};
		
		String s2[]= {"Raman"};
		
		List<String> asList = Arrays.asList(s1);
		List<String> asList2 = Arrays.asList(s2);
		
		
		ArrayList<String> ArrayList= new ArrayList<String>(asList);
		
		ArrayList.addAll(asList2);
		
		System.out.println(ArrayList);
	}

}
