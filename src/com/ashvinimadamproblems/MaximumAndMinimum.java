package com.ashvinimadamproblems;

public class MaximumAndMinimum {
	
	public static void main(String[] args) {
		
		int a[]= {10,10,20,20,30,40,50,40};
		
		int max= a[0];
		int min= a[0];
		
		for (int i=0; i<a.length; i++) {
			
			if(a[i]>max) {
				
				max=a[i]; }
			
			else if(a[i]<min) {
				
				min=a[i];
				
				
			}
		}
	System.out.println("Maximum value is>>>>"+ max);
	
	System.out.println( "minimum value is>>>"+min);
		
		
	}

}
