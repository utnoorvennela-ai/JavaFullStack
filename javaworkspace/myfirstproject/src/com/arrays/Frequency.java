package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

//Write a Java Program find the frequency of Integers in given array 
public class Frequency {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");// 7
		int size = sc.nextInt();

		int[] arr = new int[size];
		boolean[] reapt = new boolean[size];
		System.out.println("Enter the elments:");// {10,20,10,20,30,10,30}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (reapt[i]) {
				continue;
			}
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					reapt[j] = true;
				}
			}
			System.out.println(arr[i] + " : " + count);
			// System.out.println(Arrays.toString(arr));

		}
	}

}
