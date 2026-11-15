package com.logicalstatements.loops;

import java.util.Scanner;

//   0 1 1 2 3 5 8 13 21 
// N=0 1 2 3 4 5 6 7  8
public class NthFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		int fb = nthFibonacci(n, n1, n2, n3);
		System.out.println("Fibonacci of given number is:" + fb);
	}

//	static int nthFibonacci(int n, int n1, int n2, int n3) {
//		if (n == 0) {
//			return 0;
//		}
//		if (n == 1) {
//			return 1;
//		}
//		for (int i = 2; i <= n; i++) {
//			n3 = n1 + n2;
//			n1 = n2;
//			n2 = n3;
//		}
//		return n3;
//	}

	static int nthFibonacci(int n, int n1, int n2, int n3) {
		int count = 1;
		if (n == 1) {
			return 1;
		}
		while (n > 1) {
			n3 = n1 + n2;
			count++;
			if (count == n) {
				return n3;
			}
			n1 = n2;
			n2 = n3;
		}
		return 0;

	}

}
