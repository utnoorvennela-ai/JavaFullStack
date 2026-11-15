package com.arrays;

public class Intervals {

	public static void main(String[] args) {

		int a[][] = { { 1, 6 }, { 2, 5 }, { 0, 2 }, {4 , 5 } };// 0 1 0 0
		for (int i = 0; i < a.length; i++) {
			int start = a[i][0];
			int end = a[i][1];
			int value = 0;

			for (int j = 0; j < a.length; j++) {
				int nextStart = a[j][0];
				int nextEnd = a[j][1];
				if (j != i) {
					if (nextStart >= start && nextEnd <= end) {
						value = 1;
					}

				}

			}
			System.out.println(value);
		}

	}

}
