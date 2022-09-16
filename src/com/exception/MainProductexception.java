package com.exception;

import java.util.Scanner;

public class MainProductexception {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the product weight");
		int weight= sc.nextInt(); 
		sc.close();
		Product p= new Product();
		
		try {
			p.productCheck(weight);
		} catch (ProductException e) {
			System.out.println("Weight is not ok");
			
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
