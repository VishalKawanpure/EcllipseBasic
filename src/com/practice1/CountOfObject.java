package com.practice1;

public class CountOfObject {
	
	static int count=0;
	
	public CountOfObject() {
		
		count++;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		CountOfObject ob1= new CountOfObject();
		CountOfObject ob2= new CountOfObject();
		CountOfObject ob3= new CountOfObject();
		
		
		System.out.println(count);
		
		
	}
	
	

}
