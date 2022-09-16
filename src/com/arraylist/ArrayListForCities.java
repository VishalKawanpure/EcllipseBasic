package com.arraylist;

import java.util.ArrayList;

public class ArrayListForCities {
	
	public static void main(String[] args) {
		
		ArrayList <String> al= new ArrayList<String>();
		
		al.add("Pune");
		al.add("Amravati");
		al.add("Nagpur");
		al.add("Mumbai");
		al.add("Hydrabad");
		
		for(String s:al) {
			System.out.println("Using for each loop>>>"+ s);
		}
		
	}

}
