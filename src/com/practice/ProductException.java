package com.practice;

import java.util.Scanner;

public class ProductException extends Exception {
	
	
	private String message;

	public ProductException(String message) {
		super();
		this.message = message;
	}
	
}


   class Product {
	   
	  
	   
	   void productCheck(int weight) throws ProductException {
		   
		   if (weight <100) { throw new ProductException ("Weight of Product is less than 100");
		   
		   }
		   
		   else { System.out.println("weight is ok");
		   }
		   
	   }
	  
  }
   
   
   class Main{
	   
	   public static void main (String []args) {
		  
		   
		   System.out.println("Enter the product weight to check");
		   
		   Scanner sc= new Scanner(System.in);
		   Object weight = sc.nextInt();
		   
	   }
   }