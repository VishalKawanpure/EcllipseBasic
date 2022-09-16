package com.arraylist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapSorting {
	public static void main(String[] args) {
		
	
	Map<String,Integer> map= new HashMap <String,Integer>();
	map.put("Ram", 3);
	map.put("Sohan", 2);
	map.put("Ashok", 1);
	map.put("Ajay", 6);
	map.put("Prasanna ", 5);
	
	Iterator <String> itr=map.keySet().iterator();
	
	while(itr.hasNext()) {
		
		String s=itr.next();
		
		System.out.println("Name>>>"+s+"   id>>>" +map.get(s) );}
		
		//HashMap<String,Integer> map1= new HashMap <String,Integer>();
		
		TreeMap <String,Integer> tm= new TreeMap <String,Integer>(map);
		
		Iterator it= tm.keySet().iterator();
		
		while(it.hasNext()) {
			
			String s= (String) it.next();
			
			System.out.println(s+ tm.get(s));
		}
	}
	
	

}
