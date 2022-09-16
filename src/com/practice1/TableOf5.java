package com.practice1;

public class TableOf5 {
	
	
	
	void multiplication (int no) {
		
		for(int i=1; i<=10; i++) {
			
			int table= no*i;
			
			System.out.println(table);
		}}
	
	public static void main(String[] args) {
		
		TableOf5 tableOf5= new TableOf5();
		
		tableOf5.multiplication(5);
		
		
		
	}

}
