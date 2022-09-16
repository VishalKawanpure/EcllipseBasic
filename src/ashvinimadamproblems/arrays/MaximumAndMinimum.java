package ashvinimadamproblems.arrays;

public class MaximumAndMinimum {
	
	
	public static void main(String[] args) {
		
		int a[]= { 2,3,4,5,6,7,7,6};
		
		int maximum= a[0];
		int minimum= a[0];
		
		
		for( int i=0; i<a.length; i++) {
			
			if(a[i]>maximum) {
				
				maximum=a[i];
			}
			
			else if(a[i]<minimum) {
				
				minimum=a[i];
			}
		}
		
		System.out.println(maximum);
		
		System.out.println(minimum);
	}

}
