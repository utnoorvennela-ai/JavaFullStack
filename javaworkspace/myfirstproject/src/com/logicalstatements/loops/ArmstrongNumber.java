package com.logicalstatements.loops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		boolean status = isArmstrong(n);
		if (status) {
			System.out.println(n + " is a Armstrong number!!");
		} else {
			System.out.println(n + " is not a Armstrong number!!");
		}
	}

	static boolean isArmstrong(int n) {
		boolean status = false;
		int r = 0;
		int sum = 0;
		int temp = n;
		int digitcount = 0;
		int n1 = n;
		while (n1 > 0) {
			n1 = n1 / 10;
			digitcount++;
		}
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = (int) (sum + Math.pow(r, digitcount));
		}
		if (temp == sum) {
			status = true;
		}
		return status;
	}

}
