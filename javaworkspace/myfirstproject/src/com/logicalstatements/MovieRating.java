package com.logicalstatements;

import java.util.Scanner;

//WAP to give the Movie Description based on Rating
//1 → Poor
//2 → Below Average
//3 → Average
//4 → Good
//5 → Excellent
//Other → Invalid rating
public class MovieRating {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Movie Rating:");
		int Rating = sc.nextInt();

		switch (Rating) {

		case 1:
			System.out.println("poor");
			break;

		case 2:
			System.out.println("Below Average");
			break;

		case 3:
			System.out.println("Average");
			break;

		case 4:
			System.out.println("Good");
			break;

		case 5:
			System.out.println("Excellent");
			break;

		default:
			System.out.println("Invalid Rating");

		}

	}

}
