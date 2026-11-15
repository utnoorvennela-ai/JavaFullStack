package com.arrays;

import java.util.Arrays;

public class BubbleSortOptimizeSolutn {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 6, 7, 8, 9 };
		System.out.println("Before Sorting:");
		System.out.println(Arrays.toString(arr));

		int temp = 0;
		int count = 0;
		int count1 = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			boolean swapped = false;
			count++;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
				count1++;
			}
			if (!swapped) {
				break;
			}
		}

		System.out.println("count is " + count);
		System.out.println("count1 is " + count1);

		System.out.println("After Sorting:");
		System.out.println(Arrays.toString(arr));
	}

}
