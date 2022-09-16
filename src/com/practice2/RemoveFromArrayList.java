package com.practice2;

import java.util.ArrayList;

public class RemoveFromArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> ArrayList= new ArrayList<String>();
		
		ArrayList.add("Mumbai");
		ArrayList.add("Pune");
		ArrayList.add("Akola");
		ArrayList.add("Amravati");
		
		
		System.out.println(ArrayList);
		
		ArrayList.remove("Mumbai");
		
		System.out.println(ArrayList);
		
		
		
		
	}

}
