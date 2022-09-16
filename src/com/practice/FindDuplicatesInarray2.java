package com.practice;

public class FindDuplicatesInarray2 {
	
	public static void main(String[] args) {
		boolean havedup= false;
		int [] a= {1,1,2,3,4,5,66,6,66,6,8};
		System.out.println("Duplicate elements are>>");
		for (int i =0; i<a.length; i++) {
			for(int j =i+1; j<  a.length; j++) {
				
				if(a[i]==a[j]) {
					System.out.println(a[j]);
					
					 havedup= true;
				}
			}
		}
		
		if(havedup==false) { System.out.println("No duplicate values present");}
	}

}
