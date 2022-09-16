package com.comparable.and.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListComparator {
	
public static void main(String[] args) {
		
		List <Employee1> list= new ArrayList<Employee1>();
		
		list.add(new Employee1 (1, 150000,"Vishal"));
		
		list.add(new Employee1 (17, 50000,"Ram"));
		list.add(new Employee1 (13, 10000,"Rohan"));
		
		System.out.println("before Sorting>>>"+list);
		
		System.out.println("\n");
		
		Collections.sort(list);
		
		System.out.println("After sorting>>>"+list);

}}
