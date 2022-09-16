package com.ashvinimadamproblems1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
	
	
	public static void main(String[] args) {
		
		String str[]= { "ram", "Ramesh" , "Rahul"};
		
		Arrays.asList(str);
		
		
		
		ArrayList<String> ArrayList= new ArrayList<String>(Arrays.asList(str));
		
		
		ArrayList.add("Gopal");
		
		ArrayList.add("Harish");
		
		
		System.out.println(ArrayList);
		
		
		
	}

}
