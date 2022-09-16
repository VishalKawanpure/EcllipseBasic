package com.practice2;

import java.util.Arrays;

public class CountFromString {

	public static void main(String[] args) {

		String str = "hello good good morning all";

		String[] split = str.split(" ");

		Arrays.sort(split);

		for (int i = 0; i < split.length; i++) {

			int count = 1;

			for (int j = i + 1; j < split.length; j++) {
				
				

				if (split[i] == split[j]) {

					count++;
				} else
					break;

			}

			System.out.println(split[i] + ">>>>>>" + count);

			i = i + (count - 1);

		}

	}
}
