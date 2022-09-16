package com.collec;

import java.util.Arrays;

public class OccuranceInArray {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,3,3,3,5};
		
		Arrays.sort(a);
		
		for(int i=0; i<a.length; i++) {
			
			int count =1;
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]==a[j]) {
					
					count++;
				}
				else 
					break;
			}
			
			System.out.println(a[i]+">>>>>"+count);
			i=i+count-1;
		}
		
	}

}
