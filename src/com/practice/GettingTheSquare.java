package com.practice;

public class GettingTheSquare {
	
	int getSquare(int a) {
		
		int b=a*a;
		return b;
	}
	
	public static void main(String[] args) {
		
		GettingTheSquare ob= new GettingTheSquare();
		
		int square= ob.getSquare(4);
		
		System.out.println(square);
		
	}

}
