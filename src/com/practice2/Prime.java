package com.practice2;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		int count = 0;
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {

			if (number % i == 0) {
				count++;
			}

		}

		if (count == 2) {
			System.out.println("Number is Prime");
		} else {
			System.out.println("not prime");
		}
	}

}
