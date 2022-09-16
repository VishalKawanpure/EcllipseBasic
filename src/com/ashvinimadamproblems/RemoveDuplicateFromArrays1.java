package com.ashvinimadamproblems;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromArrays1 {
	
	
	public static void main(String[] args) {
		
		HashSet<Integer> set= new HashSet<Integer>();
		
		int a[]= { 10, 20, 20,30,10, 40,40, 50,60,70,50};
		
		for(int i =0; i<a.length; i++) {
			
			set.add(a[i]);
		}
		
	System.out.println(set);	
		
	}

}
