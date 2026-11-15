package com.operators;

import java.util.Scanner;

public class TestOPDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		Integer input = sc.nextInt();

		if (input % 3 == 0) {
			System.out.println("Fizz");
			if (input % 5 == 0) {
				System.out.println("Buzz");
				if (input % 3 == 0 && input % 5 == 0) {
					System.out.println("Fizz Buzz");
				} else {
					System.out.println("Not divisible");
				}

			}
		}

	}

}
