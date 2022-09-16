package com.collec;

public class EmployeeComparable implements Comparable<EmployeeComparable> {
	
	private String name;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeComparable [name=" + name + ", salary=" + salary + "]";
	}
	public EmployeeComparable(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(EmployeeComparable emp) {
		
		if(salary==emp.salary) {
			return 0;
		}
		else if(salary>emp.salary) {
			return 1;
		}
		else 
			return -1;
		
		
	}
	
	

}
