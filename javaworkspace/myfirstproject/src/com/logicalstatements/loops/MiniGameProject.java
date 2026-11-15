package com.logicalstatements.loops;

import java.util.Random;
import java.util.Scanner;

public class MiniGameProject {

	public static void main(String[] args) {
		Random R = new Random();
		Scanner sc = new Scanner(System.in);
		int x = R.nextInt(1, 11);
		// System.out.println("You have 3 chances to guess the number:");

		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter your number to guess...");
			int n = sc.nextInt();
			if (n == x) {
				System.out.println(" You Won! ");
				break;
			} else {

				System.out.println("Wrong guess.. ");
				int chances = 3 - i;
				if (chances > 0) {
					System.out.println("You have only " + chances + " chances left.");
				}
			}
			if (i == 3) {
				System.out.println("Better Luck Next Time..");
				System.out.println("The correct number was: " + x);
			}
		}

	}
}
