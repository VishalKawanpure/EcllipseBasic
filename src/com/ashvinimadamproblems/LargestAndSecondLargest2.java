package com.ashvinimadamproblems;

public class LargestAndSecondLargest2 {
	
	public static void main(String[] args) {
		
		int a[]= { 1,2,3,4,5,6,7,8,8,9,9};
		
		
		int largestElement= Integer.MIN_VALUE;
		int secondLargestElement= Integer.MIN_VALUE;
		
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]>largestElement) {
				
				secondLargestElement= largestElement;
				
				 largestElement= a[i];}
			
			else if(a[i]>secondLargestElement && a[i]!=largestElement) {
				
				secondLargestElement=a[i];
			}
		}
        System.out.println("largest element is>>>>"+largestElement);
		
		System.out.println("Second largest element is>>>>"+secondLargestElement);
	}

}
