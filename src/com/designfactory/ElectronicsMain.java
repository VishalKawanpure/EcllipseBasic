package com.designfactory;

import java.util.Scanner;

public class ElectronicsMain {
	
	public static void main(String[] args) {
		
		System.out.println("add Input");
		
		Scanner sc= new Scanner(System.in);
		
		String purchase= sc.next();
		
		Electronics purchase2 = ElectronicsFactory.createPurchase(purchase);
		
		
		System.out.println(purchase2.Getelectronics());
		
		
	}

}
