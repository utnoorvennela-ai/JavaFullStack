package com.arrays;

import java.util.Scanner;

public class BinaryToDecimals {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binay number:");// 1010-->10
		int n = sc.nextInt();
		convertBinayToDecimal(n);
	}
	static void convertBinayToDecimal(int n) {
		int r = 0;
		int count = 0;
		int decimal = 0;
		while (n > 0) {// 1010 101 10 1 0
			r = n % 10;// 0 1 0 1
			int power = (int) Math.pow(2, count);//2^0=0,2^1=2 2^0=0 2^3=8
			int mul = r * power;//0 2 0 8
			decimal = decimal + mul;//0+2+0+8
			n = n / 10;//101 10 1 0
			count++;//1 2 3 4
		}
		System.out.println(decimal);

	}

}
