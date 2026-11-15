package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print the range of prime numbers based on the given number
//Ex:n=10-->2,3,5,7
public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nummber:");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}
}
