package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Student s1= new Student(1, 16, "dilip");
		Student s2= new Student(2, 20, "amol");
		Student s3= new Student(3, 22, "raman");
		Student s4= new Student(4, 14, "raja");
		Student s5= new Student(5, 10, "sham");
		
		
		
		List <Student> list= new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		System.out.println("UnSortesd List>>>>"+list);
		
		System.out.println("\n");
		
		Collections.sort(list, new StudentAgeComparator());
		System.out.println("Sorting based on age>>>"+list);
		
		System.out.println("\n");
		
		Collections.sort(list, new StudentnameComparator());
		System.out.println("Sorting based on name>>>"+list);
		
		
	}

}
