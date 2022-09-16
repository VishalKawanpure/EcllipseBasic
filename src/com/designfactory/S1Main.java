package com.designfactory;

public class S1Main {
	
	public static void main(String[] args) {
		
		S1 s1 = S1.getSingle();
		S1 s2 = S1.getSingle();
		S1 s3 = S1.getSingle();
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
	}

}
