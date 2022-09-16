package com.array;

import java.util.Arrays;

public class MostFrequent {

	public static void main(String[] args) {

		int mostfreq = 0;
		int element = 0;

		int[] a = { 1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 5, 5, 5, 5, 4 };

		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {

			int count = 1;

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {

					count++;

				}
				if (count > mostfreq) {

					mostfreq = count;
					element = a[i];

				}
			}

		}
		System.out.println(element + "....." + mostfreq);
	}
}
