package com.logicalstatements.loops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int rev = isReversNumber(n);
		System.out.println("The reverse of a given number " + rev);
		if (n == rev) {
			System.out.println("The given number is a palindrome");
		} else {
			System.out.println("The given number is not a palindrome");
		}
	}

	static int isReversNumber(int n) {
		int rev = 0;
		int r = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}
		return rev;
	}
}
