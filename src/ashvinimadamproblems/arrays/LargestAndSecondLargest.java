package ashvinimadamproblems.arrays;

import java.util.Arrays;

public class LargestAndSecondLargest {

	public static void main(String[] args) {
		
		

		int a[] = { 1, 2, 3, 4, 5, 1, 4, 3 };
		
		Arrays.sort(a);
		
		int largest= Integer.MIN_VALUE;
		
		int seconlargest= Integer.MIN_VALUE;

		
		
		
		for( int i=0; i<a.length; i++) {
			
			if( a[i]>largest) {
				
				seconlargest=largest;
				
				largest=a[i];
			}
			
			else if(a[i]>seconlargest  && a[i]!=largest) {
				
				seconlargest=a[i];
				
				
			}
			
			
		}
		
		System.out.println(largest);
		System.out.println(seconlargest);
	}

}
