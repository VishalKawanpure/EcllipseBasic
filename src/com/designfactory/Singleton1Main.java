package com.designfactory;

public class Singleton1Main {
	
	public static void main(String[] args) {
		
		Singleton1 singleton = Singleton1.getSingleton();
		Singleton1 singleton1 = Singleton1.getSingleton();
		
		
		/*Singleton1 Singleton1= new Singleton1();*/
		
		System.out.println(singleton1.hashCode());
		System.out.println(singleton.hashCode());
		
	}

}
