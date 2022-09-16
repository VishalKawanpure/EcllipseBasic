package com.array;

import java.util.Arrays;

public class Countoccurance {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,4,3,2,3,4,5,6,5,4,3};
		
		Arrays.sort(a);
		
		for (int i=0; i<a.length; i++) {
			
			int count=1;
			
			for (int j=i+1; j<a.length; j++) {
				
				if(a[i]==a[j]) {
					count++;
				}
				
				else 
					break;
			}
			
			System.out.println(a[i]+">>>>>>"+count);
			i= i+count-1;
		}
		
		
	}

}
