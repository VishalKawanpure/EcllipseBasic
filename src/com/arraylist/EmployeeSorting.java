package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSorting {
	
	public List<E1> getEmployeeSorting(){
		
		List<E1>list = new ArrayList <E1>();
		
		list.add(new E1 ( "Ram"));
		list.add( new E1("Sohan"));
		list.add(new E1 ("Ashok"));
		list.add(new E1("Ajay"));
		list.add( new E1("Prasanna"));
		 
		//System.out.println("Before sorting>>>"+ list);
		
		
		return list;
	}
	
	   
	
	public static void main(String[] args) {
		EmployeeSorting sort =new EmployeeSorting();
		
		System.out.println("Before Sorting>>" + sort.getEmployeeSorting());
	} 

}
