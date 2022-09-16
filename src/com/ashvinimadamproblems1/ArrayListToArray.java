package com.ashvinimadamproblems1;

import java.util.ArrayList;

public class ArrayListToArray {
	
	
	public static void main(String[] args) {
		
		//String str []= { "Ram", "Mohan", "Ramesh"};
		
		
		ArrayList<String> ArrayList= new ArrayList<String>();
		
		ArrayList.add("Ram");
		
		ArrayList.add("Mohan");
		
		ArrayList.add("Ramesh");
		
		ArrayList.toArray();
		
		
		for(String s:ArrayList) {
			
			System.out.println(s);
		}
		
		
		
	}

}
