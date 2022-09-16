package com.ashvinimadamproblems;

import java.util.HashSet;

public class RemoveDuplicateFromArrays {
	
public static void main(String[] args) {
		
	HashSet<Integer>  hashset= new HashSet<Integer>();
		
		
	int a[]= {1,1,2,3,4,5,6,2,3,5,6};		
		
	for (int i=0; i<a.length; i++) {
		
		hashset.add(a[i]);
	}
		
					
		System.out.println(hashset);		
					
				
					
}}			