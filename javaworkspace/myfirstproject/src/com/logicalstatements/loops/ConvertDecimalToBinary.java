package com.logicalstatements.loops;

import java.util.Scanner;

public class ConvertDecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number:");
		int n = sc.nextInt();
		convertDecimalToBinary(n);
	}

	static void convertDecimalToBinary(int n) {
		int r = 0;
		String str = "";
		while (n > 0) {//10
			r = n % 2;//0 1
			n = n / 2;//1 0
			str = r + str;//10
		}
		System.out.println("The binary value of given number is:" + str);

	}

}
