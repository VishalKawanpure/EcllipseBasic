package ashvinimadamproblems.arrays;

import java.util.Arrays;

public class MaximumFromArry {
	
	
	public static void main(String[] args) {
		
		int a[]= { 2,3,4,5,6,6,7,7,8,8};
		
		Arrays.sort(a);
		
		int maximum=a[0];
		
		
		
		for(int i=0; i<a.length; i++) {
			
			
			if(a[i]>maximum) {
				
				maximum=a[i];
			}
			
			
		}
		
		System.out.println("max is>>>>>"+maximum);
	}
	
	

}
