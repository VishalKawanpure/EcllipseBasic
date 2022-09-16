package com.practice2;

public class Table {
	
	public static void main(String[] args) {
		
		for(int i=2; i<=20; i++) {
			
			System.out.println("Table of>>"+i);
			for(int j=1; j<=10; j++) {
				
				System.out.println(i*j);
			}
			System.out.println("\n");
		}
		
	}

}
