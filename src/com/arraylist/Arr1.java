package com.arraylist;

import java.util.ArrayList;

public class Arr1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> ArrayList= new ArrayList<Integer>();
		
		ArrayList.add(2);
		ArrayList.add(3);
		ArrayList.add(2);
		
		
		for(int i=0; i<ArrayList.size(); i++) {
			
			for(int j=i+1; j<ArrayList.size(); j++) {
				
				if(ArrayList.get(i)==ArrayList.get(j)) {System.out.println(j);}
			}
		}
	}

}
