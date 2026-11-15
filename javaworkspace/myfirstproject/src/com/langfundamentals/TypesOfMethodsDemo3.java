package com.langfundamentals;

public class TypesOfMethodsDemo3 {
	int result;
	int difference;
	int product;
	int quotient;

	void addition(int a, int b) {
		result = a + b;
		System.out.println("Addition of  two numbers : " + result);

	}

	void subtraction(int result, int b) {
		difference = result - b;
		System.out.println("Subtraction of two numbers : " + difference);
	}

	void multiplication(int difference, int b) {
		product = difference * b;
		System.out.println("Multiplication of two numbers : " + product);
	}

	void division(int product, int b) {
		quotient = product / b;
		System.out.println("Division of two numbers : " + quotient);
	}

	public static void main(String[] args) {
		TypesOfMethodsDemo3 t1 = new TypesOfMethodsDemo3();
		t1.addition(10, 10);
		t1.subtraction(t1.result, 15);
		t1.multiplication(t1.difference, 5);
		t1.division(t1.product, 4);

	}

}
