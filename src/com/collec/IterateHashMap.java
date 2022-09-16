package com.collec;

import java.util.HashMap;
import java.util.Set;

public class IterateHashMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> HashMap= new HashMap<Integer, String>();
		
		HashMap.put(1, "Ram");
		HashMap.put(2, "Sam");
		HashMap.put(3, "Rom");
		HashMap.put(4, "Kam");
		
		
//		System.out.println(HashMap);
		
		   Set<Integer> set = HashMap.keySet();
		   
		   for(Integer i: set) {
			   
			   System.out.println(i+">>>>>"+HashMap.get(i));
		   }
		  
		  
		  
		 
		  
		  
		
		
		}
		
	}


