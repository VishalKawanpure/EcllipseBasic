package com.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReturnStudent {

	public List<Student> getStudent() {

		List<Student> list = new ArrayList<Student>();

		list.add(new Student(17, "Ram", "Pune"));
		list.add(new Student(27, "Aam", "Une"));
		list.add(new Student(11, "Pam", "Fune"));
		list.add(new Student(10, "Bam", "Dune"));
		list.add(new Student(14, "Zam", "Kune"));

		for (Student st : list) {
			
			System.out.println(st);

		}
		
		System.out.println("\n");
		
		Collections.sort(list, new CityComparator());
		
		for (Student comp:list) {
			
			System.out.println("city Compare    "+comp);
		}

		return list;

	}
	
	public static void main(String[] args) {
		
		ReturnStudent ReturnStudent = new ReturnStudent();
		ReturnStudent.getStudent();
		
		
		
		
	}

}
