package com.ashvinimadamproblems;

import java.util.Arrays;

public class FindTheSecondLargest1 {
	
	
	public static void main(String[] args) {
		
		int a[]= {11,22,33,44,55,66};
		
		
		for(int i=a.length-1; i>=0; i--) {
			
			if(a[i]==a[a.length-2]) {
				
				System.out.println(a[i]);
				
				
			}
		}
	}

}
