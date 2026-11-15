package com.arrays;

public class MovingZerosToLeft {

	public static void main(String[] args) {

		System.out.println("main method started!!");
		int[] arr = { 1, 0, 2, 0, 3, 0, 4, 0 };
		int index = arr.length - 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				int temp = arr[i];// 1
				arr[i] = arr[index];//
				arr[index] = temp;
				index--;
			}
		}
	        for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
	  }
	}

}
