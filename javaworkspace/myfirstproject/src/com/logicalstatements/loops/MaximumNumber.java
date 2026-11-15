package com.logicalstatements.loops;

import java.util.Scanner;

//Wap to print max number from the given factor
/// 6--> 1,2,3 max number is 3
public class MaximumNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int max = 1;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				max = i;

			}

		}
		System.out.println("maximum number:" + max);
	}

}
