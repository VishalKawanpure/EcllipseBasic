package com.practice2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {

		ArrayList<String> ArrayList = new ArrayList<String>();

		ArrayList.add("Red");
		ArrayList.add("Blue");
		ArrayList.add("Green");
		ArrayList.add("Red");
		ArrayList.add("Blue");
		ArrayList.add("Red");
		ArrayList.add("Blue");
		ArrayList.add("Green");
		
		System.out.println(ArrayList);
		
		Collections.sort(ArrayList);
		
		System.out.println(ArrayList);

	}
}
