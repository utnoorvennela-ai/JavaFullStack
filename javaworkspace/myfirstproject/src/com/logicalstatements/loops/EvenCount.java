package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to find the even numbers count in a given number 
/// Ex:- 123466 Output :- even count is 4
public class EvenCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int count = isEvenCount(n);
		System.out.println(count);

	}

	static int isEvenCount(int n) {
		int count = 0;
		for (; n > 0; n = n / 10) {// 234
			int r = n % 10;
			if (r % 2 == 0) {
				count++;

			}

		}
		return count;
	}
}
