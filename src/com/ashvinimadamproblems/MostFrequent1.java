package com.ashvinimadamproblems;

public class MostFrequent1 {
	
	public static void main(String[] args) {
		
		int a[]= { 1,2,3,4,4,4,4,4,5,2,2,2};
		
		int maxfreq=0;
		int element=0;
		
		for(int i= 0; i<a.length; i++) {
			
			int count=1;
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]==a[j]) {
					
					count++;
				}
			}
			
			if(maxfreq<count) {
				
				maxfreq=count;
				
				element=a[i];
			}
			
		}
		System.out.println(element+" occurs "+ maxfreq+" times ");
	}

}
