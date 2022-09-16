package com.designfactory;

public class S11Main {
	
	public static void main(String[] args) {
		
		S single = S.getSingle();
		S single2 = S.getSingle();
		S single3 = S.getSingle();
		
		
		System.out.println(single.hashCode());
		System.out.println(single2.hashCode());
		System.out.println(single3.hashCode());
		
	}

}
