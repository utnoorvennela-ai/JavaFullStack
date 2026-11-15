package com.logicalstatements.loops;

import java.util.Scanner;

public class MultipleMathTable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to proceed:");
		int n1 = sc.nextInt();
		System.out.println("Enter a number where we want to print:");
		int n2 = sc.nextInt();
		mathTable(n1, n2);
	}

	static void mathTable(int n1, int n2) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Table" + i);
			System.out.println();
			for (int j = 1; j <= n2; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
			System.out.println();
		}

	}
}
