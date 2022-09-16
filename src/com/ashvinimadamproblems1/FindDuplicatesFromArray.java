package com.ashvinimadamproblems1;

public class FindDuplicatesFromArray {
	
	
	public static void main(String[] args) {
		
		int a[]= {1,1,2,3,4,5,6,6,5,4};
		
		
		
		
		for(int i=0; i<a.length; i++) {
			
			if(i<=a.length-1) {	
			
			for(int j=i+1; j<a.length; j++) {
				
				
				if(a[j]==a[i]) { 
					
					System.out.println(a[i]); }
				
				
			}
			
		}
		
	}

}}
