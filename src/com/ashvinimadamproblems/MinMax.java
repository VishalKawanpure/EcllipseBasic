package com.ashvinimadamproblems;

public class MinMax {
	
	public static void main(String[] args) {
		
		int a[]= { 3,15,78,3,78,6,12,18,24};
		
		int min=a[0];
		int max=a[0];
		
		
		for(int i=0; i<a.length; i++) {
			
			
			if(a[i]>max) {
				
				max=a[i];
			}
			
			else if(a[i]<min) {
				
				min=a[i];
			}
		}
		
		System.out.println("maximum is"+max);
		System.out.println("minimum is"+min);
	}

}
