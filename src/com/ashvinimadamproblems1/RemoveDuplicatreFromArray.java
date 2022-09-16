package com.ashvinimadamproblems1;

import java.util.HashSet;

public class RemoveDuplicatreFromArray {
	
	public static void main(String[] args) {
		
		
		int a[]= {1,1,2,3,4,5,6,6,5,4,4};
		
		
		HashSet<Integer> HashSet= new HashSet<Integer>();
		
		for( int i=0; i<a.length; i++) {
			
			
			HashSet.add(a[i]);
			
		}
		
		System.out.println(HashSet);
		
	}

}
