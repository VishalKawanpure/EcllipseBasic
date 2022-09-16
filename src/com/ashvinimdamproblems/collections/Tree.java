package com.ashvinimdamproblems.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Tree {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> TreeMap = new TreeMap<Integer, String>();
		TreeMap.put(4, "Ramu");
		TreeMap.put(1, "Ram");
		TreeMap.put(2, "Sham");
		TreeMap.put(3, "Ramesh");
		
		System.out.println(TreeMap);
		
		Set<Integer> keySet = TreeMap.keySet();
		
		for(int i:keySet) {
			System.out.println(i);
			System.out.println(TreeMap.get(i));
		}
		
		Iterator<Integer> iterator = TreeMap.keySet().iterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
			System.out.println(TreeMap.get(iterator.next()));
		}
	}

}
