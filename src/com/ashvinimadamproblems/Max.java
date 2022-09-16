package com.ashvinimadamproblems;

import java.util.Arrays;

public class Max {

	public static void main(String[] args) {

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		int a[] = { 15, 15, 15, 500, 10, 78, 78, 10, 10, 55, 1000, 1000, 500 };

		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {

				secondMax = max;
				max = a[i];
			}

			else if (a[i] > secondMax && a[i] != max) {

				secondMax = a[i];
			}
		}
		System.out.println(max);
		System.out.println(secondMax);
	}
}
