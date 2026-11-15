package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("you are Eligible for voting");
		} else {
			System.out.println("you are not Eligible for voting");
		}
		sc.close();
	}

}
