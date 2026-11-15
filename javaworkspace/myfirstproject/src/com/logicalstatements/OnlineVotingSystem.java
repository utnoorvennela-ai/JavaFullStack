package com.logicalstatements;

import java.util.Scanner;

public class OnlineVotingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user age:");
		int age = sc.nextInt();

		if (age < 18) {
			System.out.println("not Eligible!!");
		} else {
			System.out.println("Enter gender:");
			char gender = sc.next().charAt(0);

			if (gender == 'M' || gender == 'F') {

				System.out.println("Enter Voter Id:");
				String voterId = sc.next();
				System.out.println("1.Vennela");
				System.out.println("2.Laharika");
				System.out.println("3.Rasagna");
				System.out.println("4.Prasanna");
				System.out.println("Enter your choice:");
				int choice = sc.nextInt();

				switch (choice) {

				case 1 -> {
					System.out.println("Vote is Captured for Vennela");
				}

				case 2 -> {
					System.out.println("Vote is captured for Laharika");
				}

				case 3 -> {
					System.out.println("vote is captured for Rasagna");
				}

				case 4 -> {
					System.out.println("vote is captured for Prasanna");
				}

				default -> System.out.println(" Thanks for Voting To NOTA");
				}
			} else {
				System.out.println("not eligible");
			}
			sc.close();
		}

	}
}
