package com.arrays;

public class ThreeDArray {

	public static void main(String[] args) {

		int[][][] arr = new int[3][3][3];// 0 1 2-->0 1 2 -->0 1 2
//		for (int[][] arr1 : arr) {
//			for (int[] a : arr1) {
//				for (int n : a) {
//					System.out.print(n + " | ");
//				}
//				System.out.println();
//			}
//		}

		arr[0][0][0] = 50;
		arr[1][1][1] = 100;
		arr[2][2][2] = 150;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " | ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
