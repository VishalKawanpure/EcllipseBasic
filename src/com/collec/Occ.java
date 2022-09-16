package com.collec;

import java.util.Arrays;

public class Occ {
	
	public static void main(String[] args) {
		
		
		String s="I love love my India";
		String[] split = s.split(" ");
		
		Arrays.sort(split);
		
		for(int i=0; i<split.length; i++) {
			
			int count=1;
			for(int j=i+1; j<split.length; j++) {
				
				if(split[i].contains(split[j])) {
					
					count++;
				}
				else
					break;
			}
			
			System.out.println(split[i]+">>>>"+count);
			i=i+count-1;
		}
		
		
		
	}

}
