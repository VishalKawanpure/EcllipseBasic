package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
	
	public static void main(String[] args) {
		
		ArrayList <String>list= new ArrayList<String>();
		
		list.add("Ram");
		list.add("Sohan");
		list.add("Ashok");
		list.add("Ajay");
		list.add("Prasanna ");
		
		System.out.println("before sorting>>>>"+ list) ;
		
		Collections.sort(list);
		System.out.println("After Sorting>>>"+ list);
		Collections.reverse(list);
		System.out.println("After Sorting>>>"+ list);
	}

}
