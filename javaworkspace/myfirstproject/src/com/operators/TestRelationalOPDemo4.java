package com.operators;

import java.util.Scanner;

//comparison or relational operators(==,!=,>,>=,<,<=)
//Resulted value is boolean expression-->true/false
public class TestRelationalOPDemo4 {

	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1 == s2);// true address comparison with == operator
		System.out.println(s1.equals(s2));// true

		String s3 = "vennela";
		String s4 = new String("vennela");
		System.out.println(s3 == s4);// false
		System.out.println(s3.equals(s4));//true content comparison with equals or equalsIgnore methods

		int a = 10;
		int b = 20;
		int c = 10;

		float f = 5.6F;
		double f1 = 5.6;
		float f2 = 5.6789422224F;
		double f3 = 5.6789422224F;

		System.out.println("************");
		System.out.println(a == b);// false
		System.out.println(a == c);// true
		System.out.println("-------------");
		System.out.println(a != b);// true
		System.out.println(a != c);// false
		System.out.println("-------------");
		System.out.println(a < b);// true
		System.out.println(a <= b);// true
		System.out.println(a <= c);// true

		System.out.println(b < c);// false
		System.out.println(b >= c);// true
		System.out.println(b == c);// false

		System.out.println(f);
		System.out.println(f1);
		System.out.println(f == f1);// false
		System.out.println(f != f1);// true

		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f2 == f3);// true
		System.out.println(f2 != f3);// false

	}

}
