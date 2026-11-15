package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print Factorial of a Given number ..?
/// input : number --> 5! --> 5 * 4 * 3 * 2 * 1 = 120 output : number --> 120
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		long fn = findFactorial(n);
		System.out.println("Factorial Number is : " + fn);
	}

	static long findFactorial(int n) {
		long fact = 1;

		for (int i = n; i >= 1; i--) {
			fact = fact * i;// 5 * 4 *3 *2 *1 = 120
		}

		return fact;
	}

}
