package com.ashvinimadamproblems1;

public class MissingNumberFromArray {
	
	
	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		
		int a[]= {1,2,3,5,6,7,8};
		
		for(int i=0; i<a.length; i++) {
			
			sum1= sum1+a[i];
		}
		
		
		for(int j=1; j<=8; j++) {
			
			sum2= sum2+j;
		}
		
		System.out.println(sum2-sum1);
	}

}
