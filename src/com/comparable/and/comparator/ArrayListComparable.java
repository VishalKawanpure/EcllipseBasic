package com.comparable.and.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListComparable {
	
	public static void main(String[] args) {
		
		List <Employee> list= new ArrayList<>();
		
		list.add(new Employee("Vishal", 150000, "Amravati"));
		list.add(new Employee("Jayesh", 100000, "Daryapur"));
		list.add(new Employee("Ram", 50000, "Pune"));
		list.add(new Employee("Rohit", 15000, "Dhule"));
		list.add(new Employee("Rohan", 10000, "Nashik"));
		
		System.out.println("Before Sorting>>"+ list);
		
		Collections.sort(list);
		
		System.out.println("After Sorting>>"+ list);
	}

}
