package com.ashvinimamproblems;

public class Sing {
	
	static Sing sing= new Sing();
	
	private Sing() {
		
	}

	public static Sing getSingle() {
		return sing;
		
	}
}
