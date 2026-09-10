package com.introduction;

public class TestDemo3 {

	void method1() {
		System.out.println("method1 called");
		method2();
	}

	void method2() {
		System.out.println("method2 called");
		method3();
	}

	void method3() {
		System.out.println("method3 called");
		method4();
	}

	void method4() {
		System.out.println("method4 called");
	}

	public static void main(String[] args) {

	}

	static {
		TestDemo3 t1 = new TestDemo3();
		t1.method1();
	}
}