package com.array;

import java.util.Arrays;

public class LargestAndSecondLargest {
	
	public static void main(String[] args) {
		
		int largest=Integer.MIN_VALUE;
		int secondlargest=Integer.MIN_VALUE;
		
		int a []= { 12,1,3,1,2,4,5,55,55,44,44,34};
		
		Arrays.sort(a);
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]>largest) {
				
				secondlargest=largest;
				largest=a[i];
				
			}
			
			else if((a[i]>secondlargest) && a[i]!=largest) {
				
				secondlargest=a[i];
			}
			
			
		}
		
		System.out.println(largest);
		System.out.println(secondlargest);
		
	}

}
