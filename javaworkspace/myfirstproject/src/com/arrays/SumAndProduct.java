package com.arrays;

//Declare an integer array and find the sum of total integers
public class SumAndProduct {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		
		int sumOfArray = 0;
		int productOfArray=1;
		
		for (int i = 0; i < arr.length; i++) {
			sumOfArray = sumOfArray + arr[i];
			productOfArray=productOfArray*arr[i];
		}

//		for (int n : sum) {
//			sumOfArray = sumOfArray + n;
//		}
		System.out.println("Sum of values an Array:" + sumOfArray);
		System.out.println("Product of values an Array:" + productOfArray);
	}

}
