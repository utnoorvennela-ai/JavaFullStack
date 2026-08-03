package com.introduction;

public class Demo {
	static int n = 0;
	{
		n++;
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		System.out.println(n);

	}

}
