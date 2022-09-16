package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountFromFile1 {
	
	public static void main(String[] args) throws FileNotFoundException {
		int alphabet=0;
		int digit= 0;
		int spaces= 0;
		int special=0;
		FileInputStream fis= new FileInputStream("C:\\Users\\Vishal\\Desktop\\Demo.txt");
		Scanner sc= new Scanner(fis);
		
		while(sc.hasNextLine()) {
			
			String str=sc.nextLine();
			str= str.toLowerCase();
			
			for(int i=0; i<str.length(); i++) {
				
				char ch= str.charAt(i);
				
				if(ch>='a'  && ch<='z') {alphabet++;}
				else if(ch>='0'  && ch<='9') { digit++;}
				else if(ch== ' ') {spaces++;}
				else {special++;}
				
			}
			
			System.out.println("Number of alphabet>>>"+ alphabet);
			System.out.println("Number of digit>>>"+ digit);
			System.out.println("Number of spaces>>>"+spaces);
			System.out.println("Number of special characters>>"+ special);
		}
		
		
	}

}
