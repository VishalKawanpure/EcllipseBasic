package com.ashvinimdamproblems.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee1 {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(40, "Ram", "10000"));
		list.add(new Employee(20, "Rahul", "12000"));
		list.add(new Employee(50, "Ramesh", "11000"));
		list.add(new Employee(30, "Anmol", "13000"));
		list.add(new Employee(10, "Chetan", "14000"));
		
		
		
		System.out.println("Before Sorting>>>"+list);
		
		System.out.println("\n");
		Collections.sort(list);
		
		System.out.println("After Sorting>>>"+list);

	}

}
