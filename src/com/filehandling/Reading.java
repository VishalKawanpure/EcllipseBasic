package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		int alpha=0;
		FileInputStream fis= new FileInputStream("C:\\Users\\Vishal\\Desktop\\Demo.txt");
		
		Scanner sc= new Scanner(fis);
		
		while(sc.hasNextLine()) {
			
			String nextLine = sc.nextLine();
			String case1 = nextLine.toLowerCase();
			System.out.println(case1);
			
			for(int i=0; i<case1.length(); i++) {
				
				char ch=case1.charAt(i);
				
				if(ch>='a' && ch<='z') { alpha++;}
				
				
			}
			System.out.println(alpha);
		}
		
		
		
		
	}

}
