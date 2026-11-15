package com.logicalstatements.loops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		digitsSum(n);
		//int count = digitsCount(n);
		//System.out.println("Sum of all the digits:" + sum);
		//System.out.println("Count of all the digits:" + count);

	}
//
//	static int digitsCount(int n) {
//		int count = 0;
//		while (n > 0) {
//			count++;
//			n = n / 10;
//		}
//		return count;
//	}

	static void digitsSum(int n) {
		int sum = 0;
		int count=0;
		int r = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			count++;
			sum = sum + r;
		}
		
		System.out.println("Sum of all the digits:" + sum);
		System.out.println("Count of all the digits:" + count);
		
	}

}
