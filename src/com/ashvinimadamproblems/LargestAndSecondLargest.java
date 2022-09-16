package com.ashvinimadamproblems;

public class LargestAndSecondLargest {
	public static void main(String[] args) {
		
	
	int a[]= {1,3,4,5,6,7,8,9, 11,11};
	
	int largest= Integer.MIN_VALUE;
	int secondLargest= Integer.MIN_VALUE;
	
	for( int i=0; i<a.length; i++) {
		
		if(a[i]>largest) {
			secondLargest= largest;
			largest=a[i];}
		
		else if( a[i]> secondLargest  && a[i]!=largest) {
			
			
			secondLargest=a[i];
			
		}
	}
System.out.println("largest element>>>"+largest);

System.out.println("Second largest element>>>"+secondLargest);
}}
