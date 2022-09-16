package com.ashvinimadamproblems;

public class FindDuplicateFromArray {
	public static void main(String[] args) {
		
		System.out.println("duplicate elements>>>");
	int a[]= { 1,1,2,2,3,4,5,6,7,7,9,89,8,9};
	
	for(int i=0; i<a.length; i++) {
		
		for( int j=i+1; j< a.length; j++) {
			
			if(a[j]==a[i]) {
				
				System.out.println(a[j]);    }
		}
	}
	
	

}}
