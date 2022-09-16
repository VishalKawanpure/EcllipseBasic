package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw= new FileWriter("C:\\Users\\Vishal\\Desktop\\Demo.txt");
		
		fw.write("This Is Vishal");
		System.out.println("Finished");
		fw.close();
	}

}
