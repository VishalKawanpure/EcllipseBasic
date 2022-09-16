package com.practice1;

public class Square {
	
	public int getSquare( int a) {
		
		int b= a*a;
		return b;
	}

	
	public static void main(String[] args) {
		
		Square square= new Square();
		
		int square2 = square.getSquare(6);
		
		System.out.println(square2);
	}
}
