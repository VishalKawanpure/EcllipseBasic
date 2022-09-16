package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEmployee {
	
	
	public List<Employee> getEmployyeList(){
		
		List <Employee> list= new ArrayList<Employee>();
		list.add(new Employee (1, "Vishal", "150000"));
		list.add(new Employee (2, "Ram", "50000"));
		
		
		return list;
		
		
	}
	
	
	

	public static void main(String[] args) {
		ArrayListEmployee e1= new ArrayListEmployee();
		System.out.println(e1.getEmployyeList());
		
		
		
	}

}
