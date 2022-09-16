package com.ashvinimadamproblems;

import java.util.ArrayList;

public class ArraylistToArrays {
	
	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<String>();
		
		list.add("ram");
		list.add("Ramesh");
		
		Object[] array = list.toArray();
		
		for(Object a:array) {
			
			System.out.println(a);
			
		}
	}

}
