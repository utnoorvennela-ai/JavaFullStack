package com.arrays;

import java.util.Scanner;

//1. Write a Java Program to find the Second max of given array 
public class SecondMax {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a size of an array");// 4
		int num = sc.nextInt();
		//int[] arr = { 4, 5, 6, 7, 8, };

		Integer arr[] = new Integer[num];// 4 9 2 6
		System.out.println("Enter array elements:");
//		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}

		int max = Integer.MIN_VALUE;// 9
		int second_max = Integer.MIN_VALUE;// 2

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				second_max = max;
				max = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(second_max);
	}

}
