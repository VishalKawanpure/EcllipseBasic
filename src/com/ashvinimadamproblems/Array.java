package com.ashvinimadamproblems;

import java.util.Arrays;

public class Array {
	
	
	public static void main(String[] args) {
		
		
		
		int a[]= { 1,2,3,4,5,6,7,8,6,5,4,4,4,3,2};
		
		Arrays.sort(a);
		
		
		for (int i=0; i<a.length; i++) {
			
			int count=1;
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]==a[j]) {
					
					count++;
				}
				
				/*if(element<count) {
					
					element=a[i];
					
					occurs=count;
					
				}*/
				
			}
			
			System.out.println(a[i]+">>>"+count);
			i= i+(count-1);
		}
		
	}
	
	

}
