package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMobileNumbers {
	
	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		
		al.add("9999999999");
		al.add("8888888888");
		al.add("7777777777");
		al.add("6666666666");
		al.add("55555555555");
		
		System.out.println("direct printing..."+ al);
		 Iterator<String> iterator = al.iterator();
		while(iterator.hasNext()) {
			System.out.println("Using Iterator>>>>"+ iterator.next());
		}
		
	}

}
