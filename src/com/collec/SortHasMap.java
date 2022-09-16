package com.collec;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class SortHasMap {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> HashMap= new HashMap<String, Integer>();
		
		HashMap.put("Ram", 2);
		HashMap.put("Aam", 1);
		HashMap.put("Bam", 8);
		HashMap.put("Zam", 3);
		
		Set<String> keySet = HashMap.keySet();
		
		for(String s:keySet) {
			
			System.out.println(s+">>>>"+HashMap.get(s));
		}
		
		System.out.println("\n");
		TreeMap<String, Integer> TreeMap= new TreeMap<String, Integer>(HashMap);
		
		Set<String> keySet2 = TreeMap.keySet();
		
		for(String s1:keySet2) {
			
			System.out.println(s1+">>>>>"+TreeMap.get(s1));
		}
		
		
		
		
		
		
	}

}
