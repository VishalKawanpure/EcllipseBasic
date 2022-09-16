package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Vishal\\Desktop\\Demo.txt");
		
		Scanner sc= new Scanner(fis);
		
		while(sc.hasNextLine()) { 
			System.out.println(sc.nextLine());
			
			
		}
		
		sc.close();
	}

}
