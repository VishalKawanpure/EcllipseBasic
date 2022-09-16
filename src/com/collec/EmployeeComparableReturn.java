package com.collec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparableReturn {
	
	
	public List<EmployeeComparable> getEmployee(){
		
		List <EmployeeComparable> List= new ArrayList <EmployeeComparable>();
		
		List.add(new EmployeeComparable("Ram", 50000) );
		List.add(new EmployeeComparable("Nam", 10000) );
		List.add(new EmployeeComparable("Aam", 150000) );
		
		
		for(EmployeeComparable e:List) {
			
			System.out.println(e);
		}
		
		
		Collections.sort(List);
		
		//Collections.sort(List, new NameComparator());
		
		System.out.println("\n");
		
		for(EmployeeComparable sort:List) {
			
			System.out.println(sort);
		}
		
		return List;
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		EmployeeComparableReturn EmployeeComparableReturn= new EmployeeComparableReturn();
		
		EmployeeComparableReturn.getEmployee();
		
	}

}
