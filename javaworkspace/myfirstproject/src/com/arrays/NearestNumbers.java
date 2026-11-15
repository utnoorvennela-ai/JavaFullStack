package com.arrays;

//2. ⁠Write a Java program 
//To complete below requirement:-
//int arr[] = {36,45,78,66,99}
//Output:- 40 40 80 70 100
public class NearestNumbers {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] arr = { 36, 45, 78, 66, 99 };

		for (int i = 0; i < arr.length; i++) {
			int r = arr[i] % 10;// 36-->6,45-->5,78-->8,66-->6,99-->9
			if (r <= 5) {
				arr[i] = arr[i] - r;
			} else {
				arr[i] = arr[i] + (10 - r);
			}
			System.out.print(arr[i] + " ");// 40,40,80,70,100
		}
	}
}
