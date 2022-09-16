package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {
	
	
	public static void main(String[] args) {
		
		Employee e1= new Employee(1, "29", "Tom", new Address("Street 1", 666));
		Employee e2= new Employee(2, "28", "Ram", new Address("Street 2", 222));
		Employee e3= new Employee(3, "35", "Raja", new Address("Street 3", 333));
		Employee e4= new Employee(4, "21", "Rohan", new Address("Street 4", 777));
		Employee e5= new Employee(5, "42", "Rahul", new Address("Street 5", 888));
		
		
		List <Employee> list= new ArrayList<Employee> ();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		System.out.println(list);
		
		Collections.sort(list, new AgeComparator());
		
		System.out.println(list);
		
	}

}
