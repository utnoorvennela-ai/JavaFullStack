package com.oops;

import java.util.Arrays;

public class ReverseArrayOfObjects {

	public static void main(String[] args) {
		System.out.println();
		Object arr[] = { 70, new Object[] { 10, 20, 30 }, 20, new Object[] { 70, 50, 40 }, 70 };
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			Object temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Object[]) {
				Object[] b = (Object[]) arr[i];
				start = 0;
				end = b.length - 1;
				while (start < end) {
					Object temp = b[start];
					b[start] = b[end];
					b[end] = temp;
					start++;
					end--;
				}
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}

}
