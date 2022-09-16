package com.practice;

public class CountObject {
	
	static int count;
	
	public CountObject() {
		
		count++;
	}
	
	public static void main(String[] args) {
		CountObject ob1= new CountObject();
		CountObject ob2 = new CountObject();
		CountObject ob3 =new CountObject();
		
		System.out.println(count);
	}
	
	
	

}
