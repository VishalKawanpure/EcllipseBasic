package com.ashvinimadamproblems1;

public class SmallestAndSecondSmallest {
	
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4, 2,1, 5,6,6,5};
		
		int Smallest =Integer.MAX_VALUE;
		int secondSmallest= Integer.MAX_VALUE;
		
		
		for( int i=0; i<a.length; i++) {
			
			if(a[i]<Smallest) {
				
				secondSmallest=Smallest;
				Smallest=a[i];  }
			
			else if(a[i]<secondSmallest  && a[i]!=Smallest) {
				
				secondSmallest=a[i];
				
				
			}
		}
		
		
	System.out.println(Smallest);
	
	System.out.println(secondSmallest);
		
		
		
	}

}
