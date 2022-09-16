package com.practice2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSorting {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Ram", 3);
		map.put("Sohan", 2);
		map.put("Ashok", 1);
		map.put("Ajay", 6);
		map.put("Prasanna", 5);

		System.out.println(map);

		/*while (iterator.hasNext()) {

		System.out.println(iterator.next());
		}*/
		
		TreeMap<String, Integer> tma= new TreeMap<String, Integer>(map);
		
		System.out.println(tma);
		
		/*Iterator<String> iterator2 = tma.keySet().iterator();
		
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
			System.out.println(tma.get(iterator2.next()));
		}*/
	}

}
