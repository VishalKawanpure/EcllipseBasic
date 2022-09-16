package com.practice;

public class FindTheFactorial {
	
	int getFactorial (int a) {
		int fact= 1;
		for (int i=1; i<=a; i++) {
			fact= fact*i;}
		return fact; }
	
	public static void main(String[] args) {
		FindTheFactorial fc= new FindTheFactorial();
		
		int factorial= fc.getFactorial(2);
		
		System.out.println(factorial);
	

}}
