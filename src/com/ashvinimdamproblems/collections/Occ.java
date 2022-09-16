package com.ashvinimdamproblems.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Occ {

	public static void main(String[] args) {

		ArrayList<Integer> ArrayList = new ArrayList<Integer>();

		ArrayList.add(1);
		ArrayList.add(10);
		ArrayList.add(20);
		ArrayList.add(30);
		ArrayList.add(10);
		ArrayList.add(30);
		ArrayList.add(30);
		ArrayList.add(30);

		Collections.sort(ArrayList);

		Object[] array = ArrayList.toArray();

		for (int i = 0; i < array.length; i++) {

			int count = 1;
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == array[j]) {
					count++;
				} else
					break;
			}

			System.out.println(array[i] + ">>>>>>" + count);

			i = i + (count - 1);
		}
	}

}
