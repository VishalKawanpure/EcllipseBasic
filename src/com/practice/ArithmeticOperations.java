package com.practice;

public class ArithmeticOperations {
	
	int getAddition(int a, int b) {
		int c=a+b;
		return c;
	}
	int getSubstraction( int x, int y) {
		
		int z= x-y;
		return z;
	}
	int getMultiplication( int p, int q) {
		
		int r= p*q;
		return r;
	}
	
	int getDevision( int g, int f) {
		int h= g/f;
		return h;
	}
	int getAverage(int a, int b, int c, int d, int e) {
		int f=a+b+c+d+e;
		int avg= f/5;
		return avg;}
	
	public static void main(String[] args) {
		ArithmeticOperations ob = new ArithmeticOperations();
		
	int add= ob.getAddition(4, 6);
	int sub=ob.getSubstraction(5, 3);
	int dev=ob.getDevision(8, 4);
	int mult=ob.getMultiplication(4, 5);
	int avareage= ob.getAverage(1, 2, 3, 10, 6);
	System.out.println(add);
	System.out.println(sub);
	System.out.println(dev);
	System.out.println(mult);
	System.out.println(avareage);
	}
   
}
