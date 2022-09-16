package ashvinimadamproblems.arrays;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,6,7,8,9};
		
		int s1=0;
		int s2=0;
		
		for(int i=0; i<a.length; i++) {
			
			s1=s1+a[i];
		}
		
		for(int j=1; j<=9; j++) {
			
			s2=s2+j;
		}
		
		
System.out.println(s2-s1);		
	}

}
