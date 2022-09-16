package com.ashvinimadamproblems;

import java.util.Arrays;

public class StringOccurance {
	
	
	public static void main(String[] args) {
		
		String str= "amravatiivishal";
		
		
		
		char[] cs = str.toCharArray();
		
		Arrays.sort(cs);
		
		
				
		for(int i=0; i<cs.length; i++) {
			
			int count=1;
			
			for(int j=i+1; j<cs.length; j++) {
				
				
				
				if(cs[i]==cs[j]) {
					
					count++; }
				
				else 
					break; }
			
			
			System.out.println(cs[i]+">>>>>"+count);
			
			i= i+count-1;
			
			
			}
		}
		
		
		
		
		
		
				
	}


