package com.practice2;

public class GetCube {
	
	public int getCube(int a) {
		
		int b=a*a*a;
		
		System.out.println(b);
		return b;
		
	}
	
	public static void main(String[] args) {
		GetCube GetCube= new GetCube();
		
		GetCube.getCube(10);
		
		
	}

}
