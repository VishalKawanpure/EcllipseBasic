package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEmployee1 {
	
	public List<Employee> getEmployeedetails(){
		
		List list= new ArrayList();
		list.add(new Employee( 1, "Vishal", "150000"));
		list.add(new Employee( 1, "Ram", "50000"));
		return list;}
		
		public static void main (String []args) {
			
			ArrayListEmployee1 e1= new ArrayListEmployee1();
			
		List<Employee> data = e1.getEmployeedetails();
		
		System.out.println(data);
			
			
			
		}
		
		
		
		
	}


