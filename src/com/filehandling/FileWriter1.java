package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {
	
	public static void main(String[] args) throws IOException {
		
	FileWriter fw= new FileWriter("C:\\Users\\Vishal\\Desktop\\Demo.txt");
	
	fw.write("Welcome to java by vishal");
	fw.close();
	System.out.println("finished");
	}
	
}
	