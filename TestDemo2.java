package com.introduction;

public class TestDemo2 {

	static int a = 20;
	static int b = 10;

	int c = 20;
	int d = 20;

	static void add() {
		System.out.println("add=" + (a + b));
		sub();
	}

	static void sub() {
		System.out.println("sub=" + (a - b));
		TestDemo2 t = new TestDemo2();
		t.mul();

	}

	void mul() {
		System.out.println("mul=" + (c * d));
		division();
	}

	void division() {
		System.out.println("division=" + (c / d));
	}

	public static void main(String[] args) {
		add();

	}

}
