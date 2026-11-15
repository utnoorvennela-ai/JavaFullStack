package com.langfundamentals;

import java.util.Scanner;

public class JavaMethodsAssignment {

	static Scanner sc = new Scanner(System.in);
	static JavaMethodsAssignment m1 = new JavaMethodsAssignment();

	void main(String[] args) {
		m1.calculationOfSum(10, 10);
	}

	int calculationOfSum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum of two numbers is:" + sum);
		calculationOfDifference(20, 10);
		return sum;
	}

	int calculationOfDifference(int num1, int num2) {
		int difference = num1 - num2;
		System.out.println("difference of two numbers is:" + difference);
		calculationOfProduct(15, 2);
		return difference;
	}

	static int calculationOfProduct(int a, int b) {
		int product = a * b;
		System.out.println("product of two numbers :" + product);
		calculationOfQueotient(30, 6);
		return product;
	}

	static double calculationOfQueotient(int a, int b) {
		double queotient = a / b;
		System.out.println("queotient of two numbers:" + queotient);
		System.out.println("enter number:");
		int num1 = sc.nextInt();
		System.out.println("enter number:");
		int num2 = sc.nextInt();
		m1.calculationOfRemainder(num1, num2);
		return queotient;
	}

	int calculationOfRemainder(int a, int b) {
		int remainder = a % b;
		System.out.println("remainder of two numbers:" + remainder);
		return remainder;
	}
}
