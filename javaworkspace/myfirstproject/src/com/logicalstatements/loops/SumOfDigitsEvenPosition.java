package com.logicalstatements.loops;

import java.util.Scanner;

public class SumOfDigitsEvenPosition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int sum = digitsSum(n);
		System.out.println("The sum of digits in even position:" + sum);
	}

	static int digitsSum(int n) {

		int sum = 0;
		int count = 0;
		int r = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			//count++;
			if (count % 2 == 0) {
				sum = sum + r;
			}
			count++;
		}
		return sum;

	}

}
