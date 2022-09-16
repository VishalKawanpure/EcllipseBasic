package com.ashvinimadamproblems;

public class MostFrequent2 {
	
	public static void main(String[] args) {
		
		int a[]= { 1,1,1,1,1,1,1,1,1,2,2,3,4,5,6,7,8,9,2,2,2,2};
		
		int mostFrequent=0;
		int element=0;
		
		for(int i=0; i<a.length; i++) {
			
			int count=1;
			
			for(int j=i+1; j<a.length; j++) {
				
				if (a[i]==a[j]) {
					
					count++; }
				
				if(mostFrequent<count) {
					
					mostFrequent=count;
					element= a[i]; }
				
				
			}
			
		}
		System.out.println(element+ " occurs "+mostFrequent+ " times ");
	}

}
