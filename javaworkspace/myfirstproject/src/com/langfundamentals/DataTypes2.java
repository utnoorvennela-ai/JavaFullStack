package com.langfundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Arrays;

class Dog {

}

public class DataTypes2 {

	// Normal Object Data Types
	BigInteger bi1 = new BigInteger("67864578476975643567586777");
	BigInteger bi2 = new BigInteger("67865544354786768457847678");

	BigDecimal bd1 = new BigDecimal("457678645689.4354568767564");
	BigDecimal bd2 = new BigDecimal("45767854645689.435456887767564");

	String s = new String();
	String s2 = "Vennela";
	String s3 = new String("Good Morning");

	//Arrays a;

	// Wrapper Object data types
	Integer i=108;
	Short s1=25;
	Character c='F';
	Double dob=5.555;

	// User-Defined Data Type
	Dog d;

	public static void main(String[] args) {
		System.out.println("main method started");
		DataTypes2 d = new DataTypes2();

		System.out.println("BigInteger value1:" + d.bi1);
		System.out.println("BigInteger value1:" + d.bi2);
		System.out.println("                               ");
		System.out.println("add value:" + d.bi1.add(d.bi2));
		System.out.println("subtract value:" + d.bi1.subtract(d.bi2));

		System.out.println("and value:" + d.bi1.and(d.bi2));
		System.out.println("or value:" + d.bi1.or(d.bi2));

		System.out.println("multiply value:" + d.bi1.multiply(d.bi2));
		System.out.println("divide value:" + d.bi1.divide(d.bi2));

		System.out.println("max value:" + d.bi1.max(d.bi2));
		System.out.println("min value:" + d.bi1.min(d.bi2));
		System.out.println("mod value:" + d.bi1.mod(d.bi2));
		System.out.println("modInverse value:" + d.bi1.modInverse(d.bi2));
		System.out.println("remainder value:" + d.bi1.remainder(d.bi2));

		System.out.println("------------------------------------------");

		System.out.println("BigDecimal value1:" + d.bd1);
		System.out.println("BigDecimal value2:" + d.bd2);
		System.out.println(d.bd1.add(d.bd2));
		System.out.println(d.bi1.multiply(d.bi2));
		System.out.println("------------------------------------------");

		System.out.println(d.s);
		System.out.println(d.s2);
		System.out.println(d.s3);

		//System.out.println(d.a);

		System.out.println(d.i);
		System.out.println(d.s1);
		System.out.println(d.c);
		System.out.println(d.dob);

		System.out.println(d.d);

	}

}
