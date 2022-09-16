package com.practice2;

import java.util.ArrayList;
import java.util.List;

public class EmpListArrayList {

	public List<EmpList> getEmployeeDetails() {

		List<EmpList> List = new ArrayList<EmpList>();
		
		List.add(new EmpList(10,"Ram","Pune"));
		List.add(new EmpList(12,"Sam","Pune"));
		List.add(new EmpList(13,"Tam","Pune"));
		List.add(new EmpList(15,"Kam","Pune"));
		
		
		for(EmpList e:List) {
			
			System.out.println(e);
		}
		
		return List;

	}
	
	public static void main(String[] args) {
		
		EmpListArrayList EmpListArrayList= new EmpListArrayList();
		
		EmpListArrayList.getEmployeeDetails();
		
		
		
		
	}

}
