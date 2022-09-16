package com.practice2;

public class CountFromString11 {

	public static void main(String[] args) {

		String str1 = "RHTDM@3456";

		String case1 = str1.toLowerCase();

		int vowels = 0;
		int alphabet = 0;
		int number = 0;

		for (int i = 0; i < case1.length(); i++) {

			char ch = case1.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				alphabet++;

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;

				}
			}

			else if (ch >= '1' && ch <= '9') {
				number++;
			}
		}
		System.out.println(case1);
		System.out.println(vowels);
		System.out.println(alphabet);
		System.out.println(number);
	}

}
