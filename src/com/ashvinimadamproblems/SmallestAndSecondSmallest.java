package com.ashvinimadamproblems;

public class SmallestAndSecondSmallest {
	
	public static void main(String[] args) {
		
		int a[]= { 1,2,3,4,5,6,5,4,3,3, 2,1};
		
		int smallest= Integer.MAX_VALUE;
		int secondSmallest= Integer.MAX_VALUE;
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]<smallest) {
				
				secondSmallest= smallest;
				
				smallest=a[i]; }
			else if(a[i]<secondSmallest && a[i]!=smallest) {
				
				secondSmallest= a[i];
				
				
			}
		}
		
		System.out.println("Smallest number is>>>>>"+smallest);
		
		System.out.println("Second Smallest number is>>>>>"+ secondSmallest);
	}

}
