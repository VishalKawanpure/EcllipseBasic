package com.array;

public class Sing {
	
	private static Sing Singobj;

	public Sing() {
		
	}
	
	public static synchronized Sing getSingle() {
		
		if(Singobj==null) {
			
			return Singobj=new Sing();
			
		}
		return Singobj;
		
	}

}
