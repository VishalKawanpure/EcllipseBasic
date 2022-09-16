package com.ashvinimdamproblems.collections;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private String salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public Employee(int id, String name, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	@Override
	public int compareTo(Employee e) {

		if (id == e.id) {
			return 0;
		} else if (id > e.id) {
			return 1;
		}

		else {
			return -1;
		}
	}

}
