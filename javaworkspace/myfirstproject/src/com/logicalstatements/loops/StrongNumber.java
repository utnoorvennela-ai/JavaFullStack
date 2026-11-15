package com.logicalstatements.loops;

import java.util.Scanner;

//WAP To Find the Given Number is Strong Number or Not ???
/// 145 is a strong number ... 1!=1 4!=4*3*2*1=24 5!=5*4*3*2*1=120 sum
/// of values=145---->145=145
public class StrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int sum = 0;
		int n = sc.nextInt();
		int temp = n;
		for (; n > 0; n = n / 10) {
			int r = n % 10; // 5  4 1

			sum = sum + sumOfFact(r);
		}

		if (temp == sum) {
			System.out.println("is a strong number");
		} else {
			System.out.println("is not a strong number");
		}
	}

	static int sumOfFact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
