package com.ashvinimadamproblems;

public class Duplicates {
	
	public static void main(String[] args) {
		
		int b[]= {10,10,20,20,30,40,50,40};
		
		for(int i=0; i< b.length; i++) {
			
			
			for (int j= i+1; j< b.length; j++) {
				
				if(b[i]==b[j]) {
					
					System.out.println(b[j]);
				}
			}
		}
		
	
	}

}
