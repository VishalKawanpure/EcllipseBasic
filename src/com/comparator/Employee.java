package com.comparator;

public class Employee {
	
	
	private int id;
	private String age;
	private String name;
	private Address address;
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", address=" + address + "]";
	}
	public Employee(int id, String age, String name, Address address) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
