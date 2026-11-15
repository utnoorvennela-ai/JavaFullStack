package com.logicalstatements;

import java.util.Scanner;

//WAP to give the Mobile Description based on Mobile RAM → Performance.
//2 GB → Basic
//4 GB → Good
//6 GB → Better
//8 GB → High Performance
//12 GB → Ultra Performance
//Other → RAM option unavailable
public class MobileRAMInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = "";

		do {

			System.out.println("Enter Mobile RAM:");
			String RAM = sc.next().toUpperCase();

			switch (RAM) {
			case "2GB" -> System.out.println("Basic");
			case "4GB" -> System.out.println("Good");
			case "6GB" -> System.out.println("Better");
			case "8GB" -> System.out.println("High Performance");
			case "12GB" -> System.out.println("Ultra Performance");
			case "other" -> System.out.println("RAM option unavailable");
			default -> System.out.println("The Entered Mobile RAm is not avilable");

			}
			System.out.println("Do You want to Continue ..? Click Y for Yes or N for No");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));

		System.out.println("EXIT");

	}

}
