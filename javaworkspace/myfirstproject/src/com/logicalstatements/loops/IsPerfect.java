package com.logicalstatements.loops;

import java.util.Scanner;

//WAp to print the given number is perfect or not
/// perfect numbers-->6,28,496,8128 PERFECT NUMBER: sum of factors is equal to
/// the given number. ex:6-->1+2+3
public class IsPerfect {

	static boolean isPerfect(int n) {
		boolean status = false;
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
			if (sum == n) {
				status= true;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
		boolean status = isPerfect(n);
		if (status) {
			System.out.println("is perfect number");
		} else {
			System.out.println("is not a perfect number");
		}
	}

}
