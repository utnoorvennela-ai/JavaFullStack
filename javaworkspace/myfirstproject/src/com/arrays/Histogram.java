package com.arrays;

public class Histogram {

	public static void main(String[] args) {
		System.out.println("Largest Rectangle in Histogram!!");

		int[] heights = { 2, 1, 5, 6, 2, 3 };// 2 1
		int max = Integer.MAX_VALUE;

		for (int i = 0; i < heights.length-1; i++) {// 0 1
			int count = 1;
			int left = i - 1; // -1 0
			int right = i + 1; // 1 2

			while (left >= 0 && heights[i] <= heights[left]) {// -1>=0 && x -->0>=0 && 1<=2
				count++;//
				left--;
			}
			while (right < heights.length && heights[i] <= heights[right]) {
				count++;
				right++;
			}
			int LargestArea = heights[i] * count;

			if (LargestArea > max) {
				max = LargestArea;
			}
		}
		System.out.println("Largest rectangle with area is : " + max);

	}

}
