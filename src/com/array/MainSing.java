package com.array;

public class MainSing {
	
	public static void main(String[] args) {
		
		Sing single = Sing.getSingle();
		Sing single2 = Sing.getSingle();
		Sing single3 = Sing.getSingle();
		
		
		System.out.println(single.hashCode());
		System.out.println(single2.hashCode());
		System.out.println(single3.hashCode());
		
	}

}
