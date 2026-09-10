package com.introduction;

public class TestDemo1 {

	static void method1() {
		System.out.println("method1 called");
		method2();
	}

	static void method2() {
		System.out.println("method2 called");
		TestDemo1 t = new TestDemo1();
		t.method3();

		}

	void method3() {
		System.out.println("method3 called");
		method4();
	}

	void method4() {
		System.out.println("method4 called");

	}

	public static void main(String[] args) {
		method1();

	}

}
