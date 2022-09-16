package com.ashvinimadamproblems;

import java.util.Arrays;

public class Small {
	
	public static void main(String[] args) {
		
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		
		
		
		int a[]= {15,15,15,500,10,78, 78, 10, 10,55};
		
		Arrays.sort(a);
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]<smallest) {
				
				secondSmallest=smallest;
				
				smallest=a[i]; }
			
			else if(a[i]<secondSmallest && a[i]!=smallest) {
				
				secondSmallest=a[i];
				
			}
			
		
		}
		
		System.out.println(smallest);	
		System.out.println(secondSmallest);
	}

}
