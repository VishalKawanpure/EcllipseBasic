package com.ashvinimadamproblems1;

public class MaxAndMin {
	
	public static void main(String[] args) {
		
	
	int a[]= {3,4,5,6,6,7,7,3};
	
	int max=a[0];
	int min=a[0];
	
	
	for( int i=0; i<a.length; i++) {
		
		if(a[i]>max) {
			
			max= a[i];
		}
		
		else if( a[i]< min) {
			
			min= a[i];
		}
		
		
	}
	
	System.out.println(max);

	System.out.println(min);
}}
