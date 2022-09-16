package com.ashvinimadamproblems1;

import java.util.Arrays;

public class MostFrequent {
	
	public static void main(String[] args) {
		int MostFrequent=0;
		int element=0;
		
		int a[]= { 1, 2,3,4,5,6,2,3,2,3,2,3,3,3,3};
		
		Arrays.sort(a);
		
		for(int i=0; i<a.length; i++) {
			
			int count=1;
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]==a[j]) {
					
					count++;
				}
			}
		if(MostFrequent<count) {
			
			MostFrequent=count;
			
			element=a[i];
		}
		
		
		}
		
		System.out.println(element+">>>>>>>>"+MostFrequent);
	}

}
