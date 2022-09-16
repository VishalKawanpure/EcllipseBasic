package com.ashvinimdamproblems.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertLinkToArray {
	
	
	public static void main(String[] args) {
		
		LinkedList<Integer>LinkedList= new java.util.LinkedList<Integer>();
		
		LinkedList.add(10);
		LinkedList.add(20);
		LinkedList.add(30);
		LinkedList.add(40);
		
		ArrayList<Integer> ArrayList = new ArrayList<Integer>(LinkedList);
		
		ArrayList.add(50);
		
		System.out.println(ArrayList);
	}

}
