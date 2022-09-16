package com.comparable.and.comparator;

import java.util.Comparator;

public class Employeee implements Comparator<Employeee>{
	
	String name;
	int salary;
	String city;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Employeee(String name, int salary, String city) {
		super();
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public int compare(Employeee e1, Employeee e2) {
		
	   if(e1.salary==e2.salary)
		   return 0;
	   else if(e1.salary>e2.salary)
		   return 1;
	   else 
		   return -1;
	   
		
		
		
		
	}

	
	}


