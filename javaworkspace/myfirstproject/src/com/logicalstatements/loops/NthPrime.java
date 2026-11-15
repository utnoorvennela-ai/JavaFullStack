package com.logicalstatements.loops;

//WAP to print the nth prime number.. 
import java.util.Scanner;

public class NthPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
//		while (n > 0) {//10
//			if (n % 2 == 0) {
//				System.out.println(n);
//			}
//		}
		int sum = 0;
		for (int i = 0; i < n; i++) {// 10
			// if (i % 2 != 0) {
			sum = sum + i;
			// }

		}
		System.out.println(sum);
	}
}
