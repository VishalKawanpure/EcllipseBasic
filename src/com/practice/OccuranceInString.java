package com.practice;

public class OccuranceInString {
	
	
	public static void main(String[] args) {
		
		
		String str="Viiishal";
		String string = str.toLowerCase();
		
		for( int i=0; i<string.length(); i++) {
			
			char ch=string.charAt(i);
			
			int count =1;
			
			for(int j=i+1; j<string.length(); j++) {
				
				char jh= string.charAt(j);
				
				if(ch==jh) {
					
				count++;}
				
			
				else
					break;}
			
			System.out.println(ch+"  ....."+count);	
			
			i= i+(count-1);
				
		
			}
			

		
	}}
