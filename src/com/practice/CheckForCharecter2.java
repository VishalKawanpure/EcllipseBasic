package com.practice;

import java.util.Scanner;

public class CheckForCharecter2 {
	
	public static void main(String[] args) {
		
		char ch;
		System.out.println("Enter the character");
		Scanner sc= new Scanner(System.in);
		
		ch= sc.next().charAt(0);
		sc.close();
		
		if (ch>=65 && ch <=90) { System.out.println("character is capital alphabet");}
		
		else if (ch>=97 && ch <=122) { System.out.println("Character is small alphabet");}
		
		else if (ch>=48 && ch<=57) { System.out.println("Character is digit");}
		
		else{ System.out.println("Character is special character");}
		
		}
		
		
	

}