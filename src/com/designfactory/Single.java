package com.designfactory;

public class Single {
	
	
	static Single single= new Single();
	
	
	private Single() {

}
	public static Single getSingle() {
		return single;
		
	}
	
}
	
