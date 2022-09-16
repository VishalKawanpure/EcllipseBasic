package com.practice;

public class FindDuplicatesFromArray {
	public static void main(String[] args) {
		
	
	int a[]= {10,20,30,10, 30,50,60};
	boolean havedup= false;
	for(int i=0; i<a.length; i++) {
		
		for(int j=i+1; j<a.length; j++) {
			
			if(a[i]==a[j]) {
				System.out.println("found duplicate.."+a[j]);
				
				havedup= true;
			}
		}
	}

	if(havedup==false) {
		
		System.out.println("No duplicates found");
	}
}}
