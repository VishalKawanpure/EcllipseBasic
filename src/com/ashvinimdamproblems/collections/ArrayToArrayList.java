package com.ashvinimdamproblems.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	
	
	public static void main(String[] args) {
		
		String str[]= {"Ram", "Sham", "Ganesh", "Ramu"};
		
		List<String> asList = Arrays.asList(str);
		/*for(int i=0; i<str.length; i++) {
			
			System.out.println(str[i]);
		}*/
		
		
		ArrayList<String> ArrayList= new ArrayList<String>(asList);
		
		ArrayList.add("Ganu");
		
		
		System.out.println(ArrayList);
	}

}
