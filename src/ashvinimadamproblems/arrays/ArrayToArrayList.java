package ashvinimadamproblems.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
	
	public static void main(String[] args) {
		
		String s[]= { "Ram", "Ramesh", "Rohit"};
		
		Arrays.asList(s);
		
		
		ArrayList<String> ArrayList= new ArrayList<String>(Arrays.asList(s));
		
		System.out.println(ArrayList);
	}

}
