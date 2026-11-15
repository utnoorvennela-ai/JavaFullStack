package com.arrays;

public class MovingZerosToRight {

	public static void main(String[] args) {

		System.out.println("main method started!!");
		int[] arr = { 1, 0, 2, 0, 3, 0, 4, 0 };
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				index++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
