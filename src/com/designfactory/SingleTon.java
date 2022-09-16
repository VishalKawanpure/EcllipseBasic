package com.designfactory;

public class SingleTon {

	static SingleTon singleTon = new SingleTon();

	private SingleTon() {

	}

	public static SingleTon getSingleton() {
		return singleTon;

	}

}
