package com.ashvinimdamproblems.collections;

import java.util.HashMap;
import java.util.Iterator;

public class IterateTheHashMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> HashMap= new HashMap<Integer, String>();
		
		
		HashMap.put(10, "Ram");
		HashMap.put(11, "Rahul");
		HashMap.put(12, "Rohan");
		
		
		Iterator<Integer> iterator = HashMap.keySet().iterator();
		
		while(iterator.hasNext()) {
			
			Integer next = iterator.next();
			
			System.out.println(next+"   "+HashMap.get(next));
			System.out.println();
			
			
		}
	}

}
