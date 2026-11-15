package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print the factors of a given number..
//Factors:6->1,2,3,
public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for (int i = 1; i <= n ; i++) {

			if (n % i == 0) {
				System.out.println(i);

			}
		}

	}

}
