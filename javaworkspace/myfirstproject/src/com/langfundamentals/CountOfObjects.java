package com.langfundamentals;

public class CountOfObjects {
	static int count = 0;

	CountOfObjects() {
		count++;
	}

	public static void main(String[] args) {
		CountOfObjects c1 = new CountOfObjects();
		CountOfObjects c2 = new CountOfObjects();
		CountOfObjects c3 = new CountOfObjects();
		System.out.println("Count of objects is:" + count);

	}

}
