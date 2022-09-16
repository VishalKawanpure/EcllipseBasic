package com.collec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	
	public static void main(String[] args) {
		
		String s[]= {"ram", "sam"};
		
		List<String> asList = Arrays.asList(s);
		
		
		ArrayList<String> ArrayList= new ArrayList<String>(asList);
		
		ArrayList.add("Tom");
		
		System.out.println(ArrayList);
		
		
	}

}
