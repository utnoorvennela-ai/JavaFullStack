package com.langfundamentals;

// No return type + with parameters
// WAp to calculating values based on your input..?
// Arithmetic operators
// + - * / %
//Sum Difference Product Quotient Remainder
// BODMAS
public class TypesOfMethodDemo2 {

	void addition(int a, int b) { // a,b are the parameters
		System.out.println("Sum of two numbers:" + (a + b));
	}

	void add(double a, double b) {
		System.out.println("Addition of two  numbers:" + (a + b));

	}

	void subtraction(float a, float b) {
		System.out.println("Difference of two numbers:" + (a - b));
	}

	void sub(double a, double b) {
		System.out.println("subtraction of two numbers:" + (a - b));
	}

	void modulus(float a, double b) {
		System.out.println("Remainder of two numbers:" + b % a);
	}

	void multiplication(int a, int b) {
		System.out.println("Product  of two numbers:" + (a * b));
	}

	void division(int a, int b) {
		System.out.println("quotient of two numbers:" + (a / b));
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		TypesOfMethodDemo2 t1 = new TypesOfMethodDemo2();

// call by value
		t1.addition(10, 20); // arguments
		t1.subtraction(659, 465);
		t1.add(5.8, 6.7);
		t1.sub(8.8, 6.7);
		t1.multiplication(54, 45);
		t1.division(45, 5);
		t1.modulus(8, 9);
		System.out.println("main method ended");
	}

}
