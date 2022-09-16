package com.practice2;

public class ObjectCount {
	
	
	static int count;

	public ObjectCount() {
		super();
		count++;
	}
	
	public static void main(String[] args) {
		
	
	ObjectCount ObjectCount= new ObjectCount();
	ObjectCount ObjectCount2= new ObjectCount();
	ObjectCount ObjectCount3= new ObjectCount();

	System.out.println(count);
	
}}
