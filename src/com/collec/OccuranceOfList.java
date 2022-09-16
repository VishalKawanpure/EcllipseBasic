package com.collec;

import java.util.ArrayList;
import java.util.Collections;

public class OccuranceOfList {

	public static void main(String[] args) {

		ArrayList<Integer> ArrayList = new ArrayList<Integer>();

		ArrayList.add(1);
		ArrayList.add(1);
		ArrayList.add(1);
		ArrayList.add(2);
		ArrayList.add(2);
		ArrayList.add(3);

		Collections.sort(ArrayList);

		Object[] array = ArrayList.toArray();

		for (int i = 0; i < array.length; i++) {
			int count = 1;

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == array[j]) {

					count++;

				}
				else
					break;
			}
			System.out.println(array[i]+">>>>>"+count);
			i= i+count-1;
		}
		
	}

}
