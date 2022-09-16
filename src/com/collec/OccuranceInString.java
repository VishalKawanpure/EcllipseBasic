package com.collec;

import java.util.Arrays;

public class OccuranceInString {
	
	public static void main(String[] args) {
		
		String str="Amravati";
		
		String case1 = str.toLowerCase();
		
		
		char[] array = case1.toCharArray();
		
		Arrays.sort(array);
		
		for(int i=0; i<array.length; i++) {
			
			int count=1;
			
			for(int j=i+1; j<array.length; j++) {
				
				if(array[i]==array[j]) {
					count++;
				}
				else
					break;
			}
			
			System.out.println(array[i]+">>>"+count);
			i=i+count-1;
		}
	}

}
