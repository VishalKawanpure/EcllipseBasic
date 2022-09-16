package com.practice2;

public class AllphaDig {
	
	

	public static void main(String[] args) {

		char ch = '%';

		if (ch >= 48 && ch <= 57) {
			System.out.println("is num");
		}
		else if (ch >= 97 && ch <= 122) {
			System.out.println("is samll char");
		}
		else if (ch >= 65 && ch <= 90) {
			System.out.println("is big char");
		} else {
			System.out.println("Special");
		}
	}

}
