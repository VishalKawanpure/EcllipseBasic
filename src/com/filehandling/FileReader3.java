package com.filehandling;

import java.io.*;
import java.util.Scanner;

public class FileReader3 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Vishal\\Desktop\\Demo.txt");
		
		Scanner sc=  new Scanner(fis);
		
		while(sc.hasNextLine()) { 
			System.out.println(sc.nextLine());
			
			
		}
		sc.close();
	}

}
