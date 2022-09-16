package com.array;

public class Missing {
	
	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5,7,8,9,10};
		
		int s1=0;
		int s2=0;
		
		for(int i=0; i<a.length; i++) {
			
			s1=s1+a[i];
		}
		
		for(int j=1; j<=10; j++) {
			
			
			
			s2=s2+j;
		}
		
		System.out.println(s2-s1);
	}

}
