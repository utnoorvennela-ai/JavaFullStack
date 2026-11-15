package com.logicalstatements.loops;

import java.util.Scanner;

//N=9,   9^2=81 -->8+1=9.....  9=9;
public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		boolean status = isNeonNumber(n);
		if (status) {
			System.out.println("is a neon number");
		} else {
			System.out.println("is not a neon number");
		}

	}

	static boolean isNeonNumber(int n) {
		boolean status = false;
		int r = 0;
		int sum = 0;
		//int temp = r;
		int n1 = n * n;
		while (n1 > 0) {
			r = r % 10;
			n1 = n1 / 10;
			sum = sum + r;
			status = true;
		}
		return status;
	}
}
