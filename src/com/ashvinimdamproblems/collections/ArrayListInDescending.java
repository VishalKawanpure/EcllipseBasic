package com.ashvinimdamproblems.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInDescending {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> ArrayList= new ArrayList<Integer>();
		
		ArrayList.add(10);
		ArrayList.add(50);
		ArrayList.add(30);
		ArrayList.add(70);
		ArrayList.add(20);
		
		
		System.out.println("Before Sort"+ArrayList);
		
		Collections.sort(ArrayList);
		
		
		System.out.println("After Sort"+ArrayList);
		
		Collections.reverse(ArrayList);
		
		
		System.out.println("After Sort in rev order"+ArrayList);
		
		
		
		
	}

}
