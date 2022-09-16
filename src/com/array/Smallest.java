package com.array;

import java.util.Arrays;

public class Smallest {
	
	public static void main(String[] args) {
		
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		
		int []a={12,12,11,11,24,24,34,44,54,64,74,84};
		
		Arrays.sort(a);
		
		for(int i=0; i<a.length;i++ ) {
			
			if(a[i]<smallest) {
				
				secondSmallest=smallest;
				smallest=a[i];
			}
			
			else if((a[i]<secondSmallest) && (a[i]!=smallest)) {
				
				
				secondSmallest=a[i];
				
				
			}
			
			
		}
		
		System.out.println(smallest);
		System.out.println(secondSmallest);
		
		
	}

}
