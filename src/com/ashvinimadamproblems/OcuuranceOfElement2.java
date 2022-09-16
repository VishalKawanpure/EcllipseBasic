package com.ashvinimadamproblems;

import java.util.Arrays;

public class OcuuranceOfElement2 {
	
	public static void main(String[] args) {
		
		int a[]= { 1,4,5,6,3,2,6,7,1,3,4,2,8,9,2,8};
		
		Arrays.sort(a);
		
		for(int i=0; i<a.length; i++) {
			
			int count=1;{
			
			for(int j=i+1; j<a.length; j++) 
				
				if (a[i]==a[j]) 
					count++;
				
				else
					break;}
				
				System.out.println(a[i]+">>>>>"+ count);
				
				i= i+(count-1);}
			}
				
				
		}
	


