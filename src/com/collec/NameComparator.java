package com.collec;

import java.util.Comparator;

public class NameComparator implements Comparator<EmployeeComparable>{

	@Override
	public int compare(EmployeeComparable s1, EmployeeComparable s2) {
		
		return s1.getName().compareTo(s2.getName());
		
	}

}
