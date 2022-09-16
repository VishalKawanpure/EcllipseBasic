package com.designfactory;

public class S1 {
	
	static S1 sobject;
	
	private S1() {
		
		
	}

	public static synchronized S1 getSingle() {
		
		if (sobject==null) {
			
			sobject= new S1();
		}
		return sobject;
	}
}
