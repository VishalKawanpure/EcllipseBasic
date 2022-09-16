package ashvinimadamproblems.arrays;

import java.util.HashSet;

public class RemoveDuplicatesFromArray {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,2,4,5};
		
		
		
		HashSet<Integer> HashSet = new HashSet<Integer>();
		
		for( int i=0; i<a.length; i++) {
			
			HashSet.add(a[i]);
		}
		
		System.out.println(HashSet);
		
		Object[] array = HashSet.toArray();
		
		for(Object o:array) { System.out.println(o);}
	}

}
