package com.practice2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	
	public static void main(String[] args) {
		
		ArrayList<String> ArrayList= new ArrayList<String>();
		
		ArrayList.add("11111111");
		ArrayList.add("21111111");
		ArrayList.add("31111111");
		ArrayList.add("41111111");
		ArrayList.add("51111111");
		
		
		Iterator<String> iterator = ArrayList.iterator();
		
		while(iterator.hasNext()) {
			
			
			System.out.println(iterator.next());
		}
		
		
		
		
		
		
	}
}
