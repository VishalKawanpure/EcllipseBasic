package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrter2 {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw= new FileWriter("C:\\Users\\Vishal\\Desktop\\Demo.txt");
		
		fw.write("I am Vishal@123");
		fw.close();
		System.out.println("Finished");
		
	}


}

