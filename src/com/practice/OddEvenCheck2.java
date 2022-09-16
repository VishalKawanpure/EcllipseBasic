package com.practice;

import java.util.Scanner;

public class OddEvenCheck2 {
	
	public static void main(String[] args) {
		
	
	int num;
	
	System.out.println("Enter the Number");
	Scanner sc= new Scanner( System.in);
	
	num= sc.nextInt();
	
	sc.close();
	
	if (num %2==0) { System.out.println("Even");}
	
	else { System.out.println("odd");}
	
	
	

}}
