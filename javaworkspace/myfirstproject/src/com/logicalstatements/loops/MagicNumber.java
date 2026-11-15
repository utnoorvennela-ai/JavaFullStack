package com.logicalstatements.loops;

import java.util.Scanner;

//1234-->  =10-->1
public class MagicNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		boolean status = isMagicNumber(n);
		if (status) {
			System.out.println("The given number is Magic");
		} else {
			System.out.println("The given number is not a magic number");
		}
	}

	static boolean isMagicNumber(int n) {
		boolean status = false;
		while (n > 9) {
			int sum = 0;
			while (n > 0) {
				int r = n % 10;//1234%10->4,123%10->3 12%10->2 1%10=1 10%10->0
				n = n / 10;//1234/10->123/10->12/10->01/10=0 10/10=1
				sum = sum + r;//4+3+2+1
			}
			n = sum;
		}
		if (n == 1) {
			status = true;

		}
		return status;
	}
}
