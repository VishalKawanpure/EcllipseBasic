package com.arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class ArrayListAndHashMap1 {
	
	public static void main(String[] args) {
		
		List<String > mh= new ArrayList<String>();
		
		mh.add("Mumbai");
		mh.add("Pune");
		mh.add("Nagpur");
		
		List<String > kn= new ArrayList<String>();
		kn.add("Banglore");
		kn.add("Mysuru");
		
		
		List<String > mp= new ArrayList<String>();
		
		mp.add("Bhopal");
		mp.add("Indore");
		
		
		HashMap<String, List<String >> ind= new HashMap<String, List<String >>();
		
		ind.put("Maharshtra",  mh);
		ind.put("Karnataka", kn);
		ind.put("Madhya Pradesh", mp);
		
		Set<String> s = ind.keySet();
		
		for(String str:s) {
			System.out.println("State is>>>"+ str+ "    Main Cites are>>>" + ind.get(str));
		}
	}

}
