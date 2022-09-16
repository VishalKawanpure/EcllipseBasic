package com.ashvinimdamproblems.collections;

import java.util.HashMap;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {

		HashMap<String, Integer> HashMap = new HashMap<String, Integer>();

		HashMap.put("Ram", 10);
		HashMap.put("Rahul", 20);
		HashMap.put("Rushi", 30);
		HashMap.put("Zakir", 40);
		HashMap.put("Akshay", 50);

		System.out.println("Before Sorting>>>" + HashMap);

		TreeMap<String, Integer> TreeMap = new TreeMap<String, Integer>(HashMap);

		System.out.println("\n");
		System.out.println("After Sorting>>" + TreeMap);
	}

}
