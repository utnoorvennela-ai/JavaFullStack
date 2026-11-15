package com.arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 9, 8, 7, 6, 5, 4 };

		System.out.println("Before Sorting:");
		System.out.println(Arrays.toString(arr));

		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("After Sorting:");
		System.out.println(Arrays.toString(arr));
	}

}
