package ashvinimadamproblems.arrays;

import java.util.Arrays;

public class FindDuplicates {
	
	
	public static void main(String[] args) {
		
		int a[]= { 1,2,3,4,5,1,4,3};
		
		Arrays.sort(a);
		
		
		for(int i=0; i<a.length; i++) {
			
			for( int j=i+1; j<a.length; j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println(a[j]);
				}
			}
		}
	}

}
