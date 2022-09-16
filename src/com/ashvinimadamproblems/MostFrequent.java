package com.ashvinimadamproblems;

public class MostFrequent {
	
	
	public static void main(String[] args) {
		
		int a[]= { 1,2,3,4,5,6,7,8,9,1,2,1,2,1,1,1,3,3,3,3,35,6,4,3,3,2,3,4,3};
		
		int mostFreuent=0;
		int element=0;
		
		for(int i=0; i< a.length; i++) {
			
			int count=1;
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]==a[j]) {
				count++;  
				}
			}
			
			if(mostFreuent<count) {
				
				mostFreuent=count;
				
				element=a[i]; }}
			
			System.out.println(element+">>>>"+ mostFreuent);
			
		}
	}

