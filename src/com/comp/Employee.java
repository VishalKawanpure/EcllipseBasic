package com.comp;

public class Employee implements Comparable<Employee> {

	private int id;
	private int salary;
	private String name;
	private String city;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", city=" + city + "]";
	}

	public Employee(int id, int salary, String name, String city) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.city = city;
	}

	@Override
	public int compareTo(Employee emp) {
		
		

		if (salary == emp.salary) {
			return 0;

		} else if (salary > emp.salary) {

			return 1;
		} else {
			return -1;
		}

	}
}
