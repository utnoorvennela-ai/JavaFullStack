package com.arrays;

public class EquilibriumIndex {

	public static void main(String[] args) {
		System.out.println("Equilibrium index of the array");

		int[] arr = { 1, 3, 5, 2, 2 };

		for (int i = 0; i < arr.length; i++) {    //0 1 2
			int leftSum = 0;
			int rightSum = 0;
			int left = i - 1;     //-1 0 1
			int right = i + 1;    //1 2 3
			while (left >= 0) {
				leftSum += arr[left];  //4
				left--;//-1
			}
			while (right < arr.length) {
				rightSum += arr[right];  //3+5+2+2   5+2+2   2+2
				right++;   //2 3 4 5
			}
			if (leftSum == rightSum) {
				//-1==12
				//1==9
				//4==4
				System.out.println("index is " + i + " element is " + arr[i]);
			}
		}

	}

}
