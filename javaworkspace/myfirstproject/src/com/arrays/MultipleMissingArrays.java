package com.arrays;

public class MultipleMissingArrays {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 5, 9, 11 };
		for (int i = 0; i < arr.length-1; i++) {// 0 1 2 3
			int start = arr[i];// 1 //4 //5 //9
			int end = arr[i + 1];// 4 //5 //9 //11

			for (int j = start + 1; j < end; j++) {
				System.out.println(j);
			}
		}

	}
}
