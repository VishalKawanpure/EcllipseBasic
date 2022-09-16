package com.practice1;

import java.util.Scanner;

public class AlphaDigitOrSymbol {
	
	
	public static void main(String[] args) {
		System.out.println("put character");
		char ch ;
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		ch= sc.next().charAt(0);
		
		
		if(ch>='a' && ch<='z') {System.out.println("is char");}
		
		else if(ch >='0' && ch<='9') {System.out.println("is digit");}
		
		else { System.out.println("Sysmbol");}
		}
		
		
			
			
		}


