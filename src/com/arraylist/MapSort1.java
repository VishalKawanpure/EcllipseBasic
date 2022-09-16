package com.arraylist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapSort1 {
	
	public static void main(String[] args) {
		
		Map < String, Integer > map = new HashMap <String, Integer>();
		
		map.put( "Ram", 3);
		map.put( "Sohan", 2);
		map.put("Ashok", 1);
		map.put("Ajay", 5 );
		map.put("Prasanna", 6);
		System.out.println("Before Sorting");
		Iterator<String> itr =map.keySet().iterator();
		
		while(itr.hasNext()) {
			
			String a= itr.next();
			
			System.out.println("Name = "+a+ " id "+ map.get(a));
		}
		System.out.println("\n"); 
		//Map < String, Integer > map1= new HashMap< String, Integer > ();
		System.out.println("After Sorting");
		TreeMap < String, Integer > tm = new  TreeMap < String, Integer >(map);
		Iterator<String> it= tm.keySet().iterator();
		
		while(it.hasNext()) {
			
			String b=  it.next();
			
			
			System.out.println(" Name ="+ b+ " id ="+ map.get(b));
		}
		
		
	}}


