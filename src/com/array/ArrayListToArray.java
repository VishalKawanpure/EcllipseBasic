package com.array;

import java.util.ArrayList;

public class ArrayListToArray {
	
	public static void main(String[] args) {
		
		ArrayList<String> ArrayList= new ArrayList<String>();
		
		ArrayList.add("ram");
		ArrayList.add("sam");
		ArrayList.add("tam");
		
		 Object[] array = ArrayList.toArray();
		
		for(Object s:array) {
			System.out.println(s.toString());
		}
		
		
		
	}
	
	 

}
