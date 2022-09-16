package com.practice;

public class MethodForCube {

	public int getNumberCube(int a) {
		
		return a*a*a;
	}
	
	public static void main(String[] args) {
		
		MethodForCube cube =new MethodForCube();
		
		int cubeOfNum=cube.getNumberCube(3);
		
		System.out.println(cubeOfNum);
		
	}
}
