package com.arrays;

import java.util.Scanner;

//1. Write a Java Program to find the Single digit , double digit , triple digit  upto length prime numbers of a given number 

//Ex:- 12131456
//Output :- 2,3,5,31,13,…. Upto length
public class FindPrimeDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		findPrimeDigits(n);
	}

	static void findPrimeDigits(int n) {
		int t = 10;
		int x = n;
		int y = n;
		while (y != 0) {      ///iteration
			while (n > 0) {   ///digits like 1,2,3,4
				int r = n % t;
				n = n / 10;
				if (isPrime(r)) {
					System.out.println(r);
				}
			}

			t = t * 10;
			n = x;
			y = y / 10;
		}
	}

	static boolean isPrime(int r) {
		boolean status =false;
		int count=0;
		for (int i = 1; i <= r; i++) {
			if (r % i == 0) {
				count++;
			}
		}
			if(count==2) {
				status=true;
				}
		return status;
		}
	}

