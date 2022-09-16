package com.designfactory;

public class S {
	
	private static  S sobject;
	
	private S() {
		
	}
	
	public static synchronized S getSingle() {
		
		if(sobject==null) {
			
			return sobject=new S();
		}
		
		return sobject;
		
		
	}

}
