package ashvinimadamproblems.arrays;

import java.util.ArrayList;

public class ArrayListToArray {
	
	public static void main(String[] args) {
		
		ArrayList<String> ArrayList= new ArrayList<String>();
		
		ArrayList.add("ram");
		ArrayList.add("ramesh");
		ArrayList.add("ramu");
		
		
		
		Object[] array = ArrayList.toArray();
		
		System.out.println(ArrayList);
		
		for(Object o: array) {
			
			System.out.println(o);
		}
		
	}

}
