package ashvinimadamproblems.arrays;

import java.util.HashSet;

public class RemoveDup {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,5,4,3};
		
		HashSet<Integer> HashSet= new HashSet<Integer>();
		
		for(int i=0; i<a.length; i++) {
			
			HashSet.add(a[i]);
			
		}
		
		System.out.println(HashSet);
	}

}
