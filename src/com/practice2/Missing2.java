package com.practice2;

public class Missing2 {
	
	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		int a[]= { 1,2,3,4,5,6,7,8};
		
		
		for(int i=0; i<a.length; i++) {
			
			
			 sum1=sum1+a[i];
		}
		
		for(int j=0; j<=9; j++) {
			
			sum2=sum2+j;
			
			
		}
		
		System.out.println(sum2-sum1);
	}

}
