package com.arrays;

import java.util.Arrays;

//1. write a Java Program to Find the Leader elements in an Array 
//Input:- arr[] = {12,3,7,9,6,3,1};
//Output:- 12,9,6,3,1
public class LeaderElements {

	public static void main(String[] args) {

		int[] arr = { 12, 3, 7, 9, 6, 3, 1 };// 7
		System.out.println("Leader Elements");
		for (int i = 0; i < arr.length; i++) {
			boolean leader = true;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] <= arr[j]) {
					leader = false;
					break;
				}
			}
			if (leader) {
				System.out.print((arr[i] + " "));
			}
		}
	}

}
