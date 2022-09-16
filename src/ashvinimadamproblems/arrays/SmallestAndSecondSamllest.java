package ashvinimadamproblems.arrays;

public class SmallestAndSecondSamllest {
	
	public static void main(String[] args) {
		
		int a[]= { 4,5,6,7,7,6, 4};
		
		int smallest= Integer.MAX_VALUE;
		int secondSmallest= Integer.MAX_VALUE;
		
		for( int i=0; i<a.length; i++) {
			
			if(a[i]<smallest) {
				
				secondSmallest=smallest;
				smallest=a[i];  }
			
			else if( a[i]<secondSmallest  && a[i]!=smallest) {
				
				secondSmallest=a[i];
			}
			
			
		}
		
		System.out.println(smallest);
		
		System.out.println(secondSmallest);
	}

}
