package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to check whether the given number is prime or not...?
//Ex:7--> is prime
public class IsPrime1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		boolean status = isPrimeNumber(n);
		if (status) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}

	}

	static boolean isPrimeNumber(int n) {
		int count = 0;
		boolean status = false;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;

			}

		}
		if (count == 2) {
			return true;

		}
		return status;
	}

}
