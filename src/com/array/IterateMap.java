package com.array;

import java.util.HashMap;
import java.util.Set;

public class IterateMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(1, "Ram");
		hashMap.put(2, "Ramesh");
		hashMap.put(3, "Sham");
		hashMap.put(4, "Raman");
		hashMap.put(5, "Ramit");

		Set<Integer> keySet = hashMap.keySet();

		for (Integer i : keySet) {

			System.out.println(i + " value>>" + hashMap.get(i));

		}

	}

}
