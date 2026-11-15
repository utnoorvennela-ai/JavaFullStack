package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print the 1 to 100 numbers without using any loop
public class FindNumbers {

	static int printNumbers(int i) {
		if (i == 100) {
			return i;

		} else {
			System.out.println(i);
		}
		return printNumbers(i + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int n = printNumbers(i);
		System.out.println(n);

	}

}
