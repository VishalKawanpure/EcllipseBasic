package com.ashvinimadamproblems;

import java.util.Arrays;

public class OcuuranceOfElement1 {
	
	public static void main(String[] args) {
		
		int a []= {2,3,4,2,1,5,1,6,7,8,6,7};
		
		Arrays.sort(a);
		
		for(int i=0; i<a.length; i++) {
			int count=1;
			
			for(int j= i+1; j<a.length; j++) {
				
				if(a[i]==a[j])
					
				count++;
				else
					break; }
				
				System.out.println(a[i]+"  Occur "+ count+" times ");
				
				i=i+count-1;
			}
		}
		
	}


