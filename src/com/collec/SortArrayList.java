package com.collec;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> ArrayList= new ArrayList<Integer>();
		
		ArrayList.add(4);
		ArrayList.add(5);
		ArrayList.add(7);
		ArrayList.add(1);
		ArrayList.add(2,10);
		
		
		for(Integer i:ArrayList) {
			
			System.out.println(i);
		}
		System.out.println("\n");
		Collections.sort(ArrayList);
		Collections.reverse(ArrayList);
		
		for(Integer b:ArrayList) {
			
			System.out.println(b);
		}
		
	}

}
