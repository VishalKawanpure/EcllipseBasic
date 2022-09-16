package ashvinimadamproblems.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class AdditionOfArrays {
	
	public static void main(String[] args) {
		
		
		String s1[]= { "Ram", "Ramesh", "Rahul"};
		
		String s2[]= { "Rohit", "Ramu"};
		
		
		Arrays.asList(s1);
		Arrays.asList(s2);
		
		
		ArrayList<String> ArrayList = new ArrayList<String>(Arrays.asList(s1));
		
		ArrayList.addAll(Arrays.asList(s2));
		
		Object[] array = ArrayList.toArray();
		
		System.out.println(Arrays.toString(array));
		
	
}
	
	

}
