package com.arrays;

import java.util.Arrays;

//{1,2,17,9,13,10,11}
//   |
//  {2,17,-1,13,17,11,17}
public class NextGreaterElement {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 17, 9, 13, 10, 11 };
		int result[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			result[i] = -1;
			int j = (i + 1);
			for (int k = 1; k < arr.length; k++) {
				if (j == arr.length - 1) {
					j = 0;
				}
				j++;
				if (arr[j] > arr[i]) {
					result[i] = arr[j];
					break;
				}

			}
			System.out.println(Arrays.toString(result));

		}
	}
}
