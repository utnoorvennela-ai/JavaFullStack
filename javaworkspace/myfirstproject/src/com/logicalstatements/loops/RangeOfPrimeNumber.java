package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print the prime numbers based on given range ..n=10
/// 10 -> 2,3,5,7,11,13,17,19,23,29
public class RangeOfPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= 20; i++) {

			if (isPrime(i)) {
				System.out.println(i);
				count++;

				if (count == n) {
					break;
				}

			}
		}
	}

	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;

		}
//		if (n == 2) {
//			return true;
//
//		}
		if (n % 2 == 0) {
			return false;

		}
		return status;
	}

}
