package com.ashvinimadamproblems1;

public class LargestAndSecondLargest {
	
	public static void main(String[] args) {
		
		int a[]= { 1,2,3,4,7,7,6,5,6,5,5};
		
		int largest=Integer.MIN_VALUE;
		int seconLargest= Integer.MIN_VALUE;
		
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]> largest) {
				
				seconLargest=largest;
				
				largest=a[i];
				
				}
			
			else if ( a[i] > seconLargest && a[i]!=largest) {
				
				seconLargest=a[i];
				
			}
		}
		
		System.out.println(largest);
		
		System.out.println(seconLargest);
	}

}
