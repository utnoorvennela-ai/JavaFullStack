package com.logicalstatements.loops;

import java.util.Scanner;

//2. Write a Java Program to check the given number is AutoMorphic Number

//Ex:- Input :- 5
//  Output:-25 it’s automorphic number 

//Explanation:- A number called automorphic if the number and last digits of it’s square result are same 
//Ex:n=25,25^2=625   check last 2 digits(625)
public class AutoMorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nummber:");
		int n = sc.nextInt();

		int square = n * n;
		//int count = 0;
		int temp = n;
		int m = 1;

		while (n > 0) {//5
			n = n / 10;//  0
			m=m*10;
			//count++;// 1 
		}
//		for (int i = 1; i <= count; i++) {
//			m = m * 10;//10
//		}
		int r = square % m;
		if (r == temp) {
			System.out.println(r + " is a AutoMorphic Number");
		} else {
			System.out.println(r + " is not a AutoMorphic number");

		}
	}

}
