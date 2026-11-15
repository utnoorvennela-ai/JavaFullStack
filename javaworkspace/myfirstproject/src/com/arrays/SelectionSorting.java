package com.arrays;

import java.util.Arrays;

public class SelectionSorting {

	public static void main(String[] args) {

		int arr[] = { 5, 9, 2, 8, 3, 6, 1 };

		int temp = 0;

		System.out.println("Before Sorting:");

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {

			int minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[minIndex]) {

					minIndex = j;
				}
			}
			temp = arr[i];

			arr[i] = arr[minIndex];

			arr[minIndex] = temp;

		}
		System.out.println("Before Sorting:");

		System.out.println(Arrays.toString(arr));
	}

}
