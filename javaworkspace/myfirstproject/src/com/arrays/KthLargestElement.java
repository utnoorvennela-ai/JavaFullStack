package com.arrays;

public class KthLargestElement {

	public static void main(String[] args) {

		int arr[] = { 4, 5, 7, 1, 3 };
		int k = 3;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				int count = k - 1;
				System.out.println(count);
			}
			System.out.println(max);
		}
	}

}
