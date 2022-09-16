package com.ashvinimadamproblems1;

import java.util.Arrays;

public class MostFrequent1 {
	
	public static void main(String[] args) {
		
		int mostFrequent= 0;
		int element=0;
		
		
	int a[]= {1,2,3,4,5,1,2,2,2,2,2,3};
	
	Arrays.sort(a);
	
	
	for(int i=0; i<a.length; i++) {
		
		int count=1;
		
		for(int j=i+1; j<a.length; j++) {
			
			if(a[i]== a[j]) {
				
				count++; }
		}
		
		if(mostFrequent<count) {
			
			mostFrequent=count;
			
			element=a[i];
			
		}
		
		
	}
	
	System.out.println(element+">>>>>>"+mostFrequent);
	}

}
