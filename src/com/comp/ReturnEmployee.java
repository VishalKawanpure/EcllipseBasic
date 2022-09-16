package com.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReturnEmployee {

	public List<Employee> getEmployee() {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(21, 11000, "Ram", "Pune"));
		list.add(new Employee(17, 16000, "Sam", "Dune"));
		list.add(new Employee(10, 14000, "Tam", "Une"));
		list.add(new Employee(13, 43000, "Pam", "Tune"));
		list.add(new Employee(34, 31000, "Kam", "Phune"));

		for(Employee e:list) {
			System.out.println(e);
			
		}
		System.out.println("\n");
		Collections.sort(list);
		
		for(Employee sort:list) {
			
			System.out.println("Sorted  "+sort);
		}

		return list;

	}

	public static void main(String[] args) {

		ReturnEmployee ReturnEmployee = new ReturnEmployee();

		 ReturnEmployee.getEmployee();
		
		}

	}

