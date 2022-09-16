package com.designfactory;

public class Singletonn {
	
	static Singletonn singletonn= new Singletonn();

	private Singletonn() {
		
	}
	
	public static Singletonn getSingle() {
		
		
		return singletonn;
		
		
	}
	
	

}
