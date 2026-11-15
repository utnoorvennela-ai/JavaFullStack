package com.arrays;

import java.util.Scanner;

public class StringArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter  array size:");// 9
		int name = sc.nextInt();

		System.out.println("Enter row size");// 3
		int n = sc.nextInt();

		System.out.println("Enter column size");// 3
		int m = sc.nextInt();

		String[][] names = new String[n][m];

		System.out.println("Enter names");
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				names[i][j] = sc.next();
			}

		}

//		names[0][0] = "vennela";
//		names[0][1] = "lahari";
//		names[0][2] = "abhigna";
//
//		names[1][0] = "rasagna";
//		names[1][1] = "sreevani";
//		names[1][2] = "prasanna";
//
//		names[2][0] = "nandhini";
//		names[2][1] = "vaishnavi";
//		names[2][2] = "nikitha";

//		for (int i = 0; i < names.length; i++) {
//			for (int j = 0; j < names[i].length; j++) {
//				System.out.print(names[i][j] + " | ");
//			}
//			System.out.println();
//		}

		for (String[] name1 : names) {
			for (String nm : name1) {
				System.out.print(nm + " | ");
			}
			System.out.println();
		}
	}

}
