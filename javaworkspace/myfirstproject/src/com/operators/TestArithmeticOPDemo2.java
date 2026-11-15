package com.operators;

import java.util.Scanner;

//WAP to do calculator with methods?
//Arithmetic Operators(+,-,*,/,%)
public class TestArithmeticOPDemo2 {

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a value:");
		float a1 = sc.nextFloat();
		System.out.println("Enter b value:");
		double a2 = sc.nextDouble();
		double sum = addition(a1, a2);
		System.out.println("Sum of two numbers is :" + sum);
		int a = 10;
		int b = 20;
		System.out.println("Addition is --> Sum:" + (a + b));

		System.out.println("Enter a value:");
		float b1 = sc.nextFloat();
		System.out.println("Enter b value:");
		double b2 = sc.nextDouble();
		double diff = subtraction(b1, b2);
		System.out.println("subtraction of two numbers:" + diff);
		System.out.println("Subtraction is --> Diff:" + (b - a));

	}

	double addition(float a, double b) {
		double sum = a + b;
		return sum;

	}

	double subtraction(double a, double b) {
		double diff = a - b;
		return diff;

	}
	

}
