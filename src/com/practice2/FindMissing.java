package com.practice2;

public class FindMissing {
	
	public static void main(String[] args) {
		
		int sum1=0;
		int sum2=0;
		
		
		
		int a []= { 1,2,3,4,5,7,8,9};
		
		for(int i=0; i<a.length; i++) {
			
			sum1= sum1+a[i];
			
			
		}
		
		for (int j=1; j<=9; j++) {
			
			sum2= sum2+j;
			
			
		}
		
		int missing=sum2-sum1;
		
		System.out.println(missing);
		
//		System.out.println(sum1);
//		System.out.println(sum2);
	}

}
