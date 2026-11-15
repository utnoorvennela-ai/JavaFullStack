package com.logicalstatements;

import java.util.Scanner;

//WAP to print the Cricketer Info Based on their Jersey number ..? 
public class CricketerInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter jersey number:");
		int jno = sc.nextInt();

		switch (jno) {

		case 18:
			System.out.println("Virat Kohli");
			System.out.println("The most Consistent player in the world");
			break;

		case 45:
			System.out.println("Rohit Sharma");
			System.out.println("Powerful opener");
			break;

		case 7:
			System.out.println("MS Dhoni");
			System.out.println("Calm finisher");
			break;

		case 10:
			System.out.println("Sachin Tendulkar");
			System.out.println("Cricket legend");
			break;

		case 63:
			System.out.println("Suryakumar Yadav");
			System.out.println("Explosive batsman");
			break;

		case 33:
			System.out.println(" Hardik Pandya");
			System.out.println("Dynamic all-rounder");
			break;
		default:
			System.out.println("Enter valid jersey number");
		}
	}

}
