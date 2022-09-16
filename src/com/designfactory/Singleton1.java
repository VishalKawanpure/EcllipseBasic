package com.designfactory;

public class Singleton1 {
	
	
	static Singleton1 s= new Singleton1();
	
	
	
	private Singleton1() {
		
	}
	
    public static  Singleton1 getSingleton() {
    	
    	return s;
    	
    	
    }
    
    public static void main(String[] args) {
    	
    	 Singleton1 s1= new Singleton1();
		
    	System.out.println(s.hashCode());
    	System.out.println(s1.hashCode());
    	
	}
}
