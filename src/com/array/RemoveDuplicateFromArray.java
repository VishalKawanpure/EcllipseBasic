package com.array;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromArray {
	
	public static void main(String[] args) {
		
		int a[]= { 1,2,3,4,5,6,3,5};
		
		Arrays.sort(a);
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<a.length; i++) {
			
			
			set.add(a[i]);
		}
		
		System.out.println(set);
	}

}
