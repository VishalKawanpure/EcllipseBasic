package com.practice2;

public class Square {

	public int getSquare(int a) {
		
		int b=a*a;
		return b;
	}
	
	public static void main(String[] args) {
		
		Square square= new Square();
		
		int square2 = square.getSquare(5);
		
		System.out.println(square2);
		
	}
}
