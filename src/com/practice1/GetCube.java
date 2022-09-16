package com.practice1;

public class GetCube {
	
	public int getNumberCube(int num) {
		
		int cube= num*num*num;
		
		return cube;
		
	}
public static void main(String[] args) {
	GetCube GetCube= new GetCube();
	
	int cube = GetCube.getNumberCube(10);
	
	System.out.println(cube);
}
}
