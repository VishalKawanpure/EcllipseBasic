package com.practice2;

import java.util.Arrays;

public class OccuranceOfString {
	
	public static void main(String[] args) {
		
		String str="I love love my India";
		
		String[] split = str.split(" ");
		
		Arrays.sort(split);
		
		for(int i=0; i<split.length; i++) {
			
			int count=1;
			
			for (int j=i+1; j<split.length; j++) {
				
				if(split[i].contains(split[j])) {
					
					count++;}
				else 
					break; }
			
			System.out.println(split[i]+">>>>"+count);
			
			i=i+(count-1);
				}
				
				
			}
		}
		
		
	


