package com.designfactory;

public class SMain {
	
	public static void main(String[] args) {
		
		Sing single = Sing.getSingle();
		Sing single1 = Sing.getSingle();
		Sing single2 = Sing.getSingle();
		
		
		System.out.println(single.hashCode());
		System.out.println(single1.hashCode());
		System.out.println(single2.hashCode());
	}

}
