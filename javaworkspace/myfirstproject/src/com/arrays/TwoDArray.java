package com.arrays;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
//     using Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array row size:");
		int n = sc.nextInt();
		System.out.println("Enter array column size:");
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		System.out.println("Enter the array elemnts");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}

		}
//      without using scanner class
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[0][2] = 30;
//
//		arr[1][0] = 40;
//		arr[1][1] = 50;
//		arr[1][2] = 60;
//		Ex:[1 2]
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
		//// int temp = arr[i][j]; / arr[i][j] = arr[j][i]; / arr[j][i] = temp;
//				System.out.print(arr[i][j] + " | ");
//			}
//			System.out.println();
//		}

		for (int[] a1 : arr) {
			for (int a : a1) {
				System.out.print(a + " | ");
			}

			System.out.println();
		}
	}

}
