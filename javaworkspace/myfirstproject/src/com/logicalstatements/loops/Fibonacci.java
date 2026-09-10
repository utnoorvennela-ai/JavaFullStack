package com.logicalstatements.loops;

// Fibonacci Series: 0 1 1 2 3 5 8 13 21 34
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" How Many values to print:");
		int n = sc.nextInt();

		int n1 = 0;
		int n2 = 1;
		int n3 = 0;

		System.out.print(n1 + " " + n2);
		for (int i = 1; i <= n - 2; i++) {
			n3 = n1 + n2;
			System.out.print(" "  +n3);
			n1 = n2;
			n2 = n3;

		}
	}

}
