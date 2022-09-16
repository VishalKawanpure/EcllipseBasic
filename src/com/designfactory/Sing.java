package com.designfactory;

public class Sing {
	
	static Sing Singobj;
	
	private Sing() {
		
	}

	public static synchronized Sing getSingle() {
		
		if(Singobj==null) {
			
			Singobj = new Sing();
		}
		return Singobj;
			
			
		}}
			
			
