package com.ashvinimadamproblems;

import java.util.Arrays;

public class FindTheSecondLargest {
	
	
	public static void main(String[] args) {
		
		
		int a[]= { 10,20,30,100,50,105,1050};
		
		//for(int b:a) { System.out.println(b);
		
		Arrays.sort(a);
		
		
		
		
		for(int i=a.length-1; i>=0; i--) {
			
			if(a[i]== a[a.length-2]) {
			
			System.out.println(a[i]);
			
			
			
		
		}}}}
