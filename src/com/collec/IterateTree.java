package com.collec;

import java.util.Set;
import java.util.TreeMap;

public class IterateTree {

	public static void main(String[] args) {

		TreeMap<Integer, String> TreeMap = new TreeMap<Integer, String>();

		TreeMap.put(1, "Ram");
		TreeMap.put(4, "Aam");
		TreeMap.put(2, "Kam");
		
		
		Set<Integer> keySet = TreeMap.keySet();
		
		for(Integer i:keySet) {
			
			System.out.println(i+">>>"+TreeMap.get(i));
		}
		
		

	}

}
