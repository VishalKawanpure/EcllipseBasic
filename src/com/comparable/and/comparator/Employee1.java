package com.comparable.and.comparator;

public class Employee1 implements Comparable<Employee1> {
	
	int id;
	int salary;
	String name;
	public Employee1(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employee1 e1) {
		
		if(id== e1.id)
			return 0;
		else if (id>e1.id)
			return 1;
		else 
			return -1;
	}
	
	

}
