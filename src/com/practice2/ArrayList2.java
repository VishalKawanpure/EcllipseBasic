package com.practice2;

import java.util.ArrayList;

public class ArrayList2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> ArrayList= new ArrayList<String>();
		
		ArrayList.add("Pune");
		ArrayList.add("Mumbai");
		ArrayList.add("Dhule");
		ArrayList.add("Amravati");
		ArrayList.add("Akola");
		
		
		for(String s:ArrayList) {
			
			System.out.println(s);
		}
	}

}
