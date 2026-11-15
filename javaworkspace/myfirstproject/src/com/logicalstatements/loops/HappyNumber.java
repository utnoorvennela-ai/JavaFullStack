package com.logicalstatements.loops;

import java.util.Scanner;

// 16-->1^2 , 6^2= 1+36 -->37
//37-->3^2 ,7^2= 9+49 -->58
//58-->5^2,8^2=25+64=89
public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		isHappyNumber(n);
	}

	static void isHappyNumber(int n) {
		int temp = n;
		while (temp != 1 && temp != 4) {
			int r = 0;
			int sum = 0;
			while (temp > 0) {
				r = temp % 10;// 6
				temp = temp / 10;// 1
				sum = sum + (r * r);
			}
			temp = sum;
		}
		if (temp == 1) {
			System.out.println("is a happy number");
		} else {
			System.out.println("is not a happy number");
		}
	}
}
