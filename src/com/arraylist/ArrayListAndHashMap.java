package com.arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class ArrayListAndHashMap {
	public static void main(String[] args) {
		
		
		List <String> maharashra= new ArrayList<>();
		
		maharashra.add("Mumbai");
		maharashra.add("Pune");
		maharashra.add("Nagpur");
		
		List <String> karnataka= new ArrayList<>();
		
		karnataka.add("Bangalore");
		karnataka.add("Mysore");
		
		List <String> madhyaPradesh= new ArrayList<>();
		madhyaPradesh.add("Bhopal");
		madhyaPradesh.add("Indore");
		
		HashMap <String, List <String>> india= new HashMap <String, List <String>>();
		india.put("Maharashtra", maharashra);
		india.put("Karnataka", karnataka );
		india.put("Madhya Pradesh", madhyaPradesh );
		
		Set<String> s=  india.keySet();
		
		for(String str:s) {
			System.out.println("State ="+ str+ "   Main Cities ="+india.get(str));
		}
		
		
		
	}

}
