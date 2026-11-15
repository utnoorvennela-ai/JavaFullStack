package com.constructors;

import java.util.Scanner;

public class Swapping {
	// int a = 10;
	// int b = 20;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = sc.nextInt();
		System.out.println("Enter b value:");
		int b = sc.nextInt();

		System.out.println();
		System.out.println("Before Swapping:");
		System.out.println("A value is: " + a);
		System.out.println("B value is: " + b);
		System.out.println("--------------------");

//using temporary variable or third variable.
		int temp = a;
		a = b;
		b = temp;

// WAP to swap the numbers without using third variable 
		a=a+b;
		 b=a-b;
		 a=a-b;

		System.out.println("After Swapping:");
		System.out.println("A value is: " + a);
		System.out.println("B value is: " + b);
		sc.close();

	}

}
