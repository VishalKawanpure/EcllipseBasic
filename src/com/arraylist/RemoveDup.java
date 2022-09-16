package com.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDup {
	
	public static void main(String[] args) {
		
		List <Integer>list= new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(100);
		
		System.out.println(list);
		
		HashSet <Integer> set= new HashSet<>(list);
		System.out.println(set);
	}

}
