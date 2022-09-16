package com.array;

import java.util.Arrays;

public class MostOcc {
	
	public static void main(String[] args) {
		
		int mf=0;
		int el=0;
		
		int a[]= {1,2,3,4,5,5,5,5,5};
		
		Arrays.sort(a);
		
		for(int i=0; i<a.length; i++) {
			
			int count=1;
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]==a[j]) {
					count++;
				}
			}
			
			if(count>mf) {
				
				mf=count;
				el=a[i];
			}
			
			
		}
		System.out.println(el+">>>>"+mf);
	}

}
