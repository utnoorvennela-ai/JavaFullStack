package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print the math table
/// 5 X 1 = 5
public class MathTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to proceed:");
		int n1 = sc.nextInt();
		System.out.println("Enter a number where we want to print:");
		int n2 = sc.nextInt();
		math(n1, n2);

	}

	static void math(int n1, int n2) {
		for (int i = 1; i <= n2; i++) {
			System.out.println(n1 + " X " + i + " = " + (n1 * i));

		}

	}

}
