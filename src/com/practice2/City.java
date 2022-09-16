package com.practice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class City {

	public static void main(String[] args) {

		ArrayList<String> Maharashtra = new ArrayList<String>();

		Maharashtra.add("Mumbai");
		Maharashtra.add("Pune");
		Maharashtra.add("Nagpur");

		ArrayList<String> Karnataka = new ArrayList<String>();

		Karnataka.add("Bangalor");
		Karnataka.add("Mysore");

		ArrayList<String> mp = new ArrayList<String>();

		mp.add("Bhopal");
		mp.add("Indore");
		
		
		HashMap <String, ArrayList<String>>ind= new HashMap<String, ArrayList<String>>();
		
		ind.put("Maharashta", Maharashtra);
		ind.put("Karnataka", Karnataka);
		ind.put("Madhya Pradesh", mp);
		
		
		System.out.println(ind);
		
		TreeMap<String, ArrayList<String>> tm= new TreeMap<String, ArrayList<String>>(ind);
		System.out.println(tm);
		

	}

}
