package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print the digit sum
///EX:123=6
public class DigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int sum = 0;
		for (; n > 0; n = n / 10) {// 3 2 1
			int r = n % 10;//
			sum = sum + r;
		}
		System.out.println(sum);

	}
}
