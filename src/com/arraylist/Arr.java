package com.arraylist;

import java.util.ArrayList;

public class Arr {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList= new ArrayList();
		
		arrayList.add("Ram");
		arrayList.add("Rohit");
		arrayList.add("Ram");
		arrayList.add("Rahul");
		
		
		System.out.println(arrayList);
		
		for(int i=0; i<arrayList.size(); i++) {
			
			for(int j=i+1; j<arrayList.size(); j++) {
				
				if (arrayList.get(i)==arrayList.get(j)) {
					
					System.out.println(arrayList.get(j));
				}
			
				
				}
			
		}
		
		
		
		
		
		
		
		
	}

}
