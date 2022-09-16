package com.ashvinimdamproblems.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class IterateTheHashMap1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> HashMap= new HashMap<Integer, String>();
		
		HashMap.put(1, "ram");
		HashMap.put(2, "ravi");
		HashMap.put(3, "rohit");
		
		System.out.println("Fiest way");
		System.out.println(HashMap);
		
		
		System.out.println("second way");
		
		Iterator<Integer> iterator = HashMap.keySet().iterator();
		
		while(iterator.hasNext()) {
			
			Integer i = iterator.next();
			
			System.out.println("Key= "+ i+ " value ="+HashMap.get(i));
			
			
			
				
			}
		System.out.println("third way");
		
		Set<Integer> set = HashMap.keySet();
		
		for(int j:set) {
			System.out.println(j+"  "+HashMap.get(j));
		}
		
	}

}
