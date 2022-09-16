package com.practice2;

public class CountString {

	public static void main(String[] args) {

		String str = "RHtdm%567";
		String case1 = str.toLowerCase();

		int vowels = 0;
		int alpha = 0;
		int num = 0;

		for (int i = 0; i < case1.length(); i++) {

			char ch = case1.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				alpha++;

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				}
			} else if (ch >= '1' && ch <= '9') {
				num++;

			}
		}

		System.out.println(case1);
		System.out.println(alpha);
		System.out.println(vowels);
		System.out.println(num);

	}

}
