package com.arraylist;

import java.util.ArrayList;

public class ArrayListRemove {

	
	public static void main(String[] args) {
		
		ArrayList <String> al= new ArrayList<String>();
		
		al.add("Mumbai");
		al.add("Pune");
		al.add("Hydrabad");
		al.add("Banglore");
		al.add("Mumbai");
		
		
		
	if( al.contains("Mumbai")) {
		
		al.remove(String.valueOf("Mumbai"));
	}
		
		
		System.out.println(al);
		System.out.println(al.contains("Mumbai"));
		al.remove("Mumbai");
		System.out.println(al);
	}
}
