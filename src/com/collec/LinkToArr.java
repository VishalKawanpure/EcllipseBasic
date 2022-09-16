package com.collec;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkToArr {
	
	public static void main(String[] args) {
		
		LinkedList<Integer>  LinkedList= new LinkedList<Integer>();
		
		LinkedList.add(2);
		LinkedList.add(4);
		
		ArrayList<Integer> ArrayList = new ArrayList<Integer>(LinkedList);
		
		ArrayList.add(6);
		
		
		System.out.println(ArrayList);
		
		
	}

}
