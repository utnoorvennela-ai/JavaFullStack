package com.arrays;

import java.util.Arrays;

public class SumOfTwoArrays {

	public static void main(String[] args) {

		int[] a1 = { 1, 2, 3 };
		int[] b1 = { 4, 5, 6 };

		int[] temp = new int[a1.length];
		for (int i = 0; i < a1.length; i++) {
			temp[i] = a1[i] + b1[i];
		}
		System.out.print(Arrays.toString(temp));

	}

}
