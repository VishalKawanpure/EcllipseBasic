package com.designfactory;

import java.util.Scanner;

public class Bookmain {
	public static void main(String[] args) {
		
	
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter");
	
	String book= sc.next();
	
	Book book2 = Bookfact.createBook(book);
	
	
	
	System.out.println(book2.getBook());
	
	

}}
