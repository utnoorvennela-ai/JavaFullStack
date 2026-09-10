package com.introduction;

public class Demo1 {
	static int a = 20;
	static int b = 10;
	int c = 20;
	int e = 20;

	static void add() {
		System.out.println(a + b);
		sub();

	}

	static void sub() {
		System.out.println(a - b);
		Demo1 d = new Demo1();
		d.mul();

	}

	void mul() {
		System.out.println(c * e);
		division();

	}

	void division() {
		System.out.println(a / e);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();

	}

}
