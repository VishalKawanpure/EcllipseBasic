package com.practice2;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		System.out.println("add year");
		int year;

		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();

		if ((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0)) {

			System.out.println("is leap");

		} else {
			System.out.println("Not leap");
		}

	}

}


