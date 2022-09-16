package com.exception;

import java.util.Scanner;

@SuppressWarnings("serial")
public class HighSpeedExeption extends Exception {
	
	String massage;

	public HighSpeedExeption(String massage) {
		super(massage);
		this.massage = massage;
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Please add speed");
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		int speed = sc.nextInt();
		
		if(speed>50) {
			
			try {
				throw new HighSpeedExeption("Please low your speed");
			} catch (HighSpeedExeption e) {
				
				e.printStackTrace();
			}
		}
		
		else { System.out.println("This is good Speed");}
	}

}
