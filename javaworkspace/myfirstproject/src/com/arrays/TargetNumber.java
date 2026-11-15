package com.arrays;

public class TargetNumber {

	public static void main(String[] args) {

		int[] arr = { 7, 0, 1, 4, 3, 6, 5 };
		int target = 7; // 1+6=7, 4+3=7
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println(arr[i] + " , " + arr[j]);
				}

			}
		}
	}

}
