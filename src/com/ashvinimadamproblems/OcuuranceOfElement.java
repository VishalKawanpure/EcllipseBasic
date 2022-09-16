package com.ashvinimadamproblems;

import java.util.Arrays;

public class OcuuranceOfElement {
	
	public static void main(String[] args) {
		
		int a []= {2,1,3,4,5,7,4,7,8,3};
		
		Arrays.sort(a);
	
	//for(int i:a) { System.out.println(i);}
		
		for( int i=0; i<a.length;i++) {
			
			int count=1;
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]==a[j])
				
					count++;
				
				
				else
					break;
			}
			
			System.out.println(a[i]+">>>>>>>"+count);
			
			i=i+(count-1);
		}
		

}}
