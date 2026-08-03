package com.introduction;

public class Cricketer {
	// Instance variable declaration
	String cricketerName;
	int jerseyNo;
	int age;
	// Static variable declaration
	static String countryName;
	static String boardName;

	public static void main(String[] args) {
		System.out.println("main method started");
		countryName = "India";
		boardName = "BCCI";
		System.out.println("countryName:" + countryName);
		System.out.println("boardName:" + boardName);
		// object creation
		Cricketer c1 = new Cricketer();
		c1.cricketerName = "virat kohli";
		c1.jerseyNo = 42;
		c1.age = 28;
		System.out.println("cricketerName:" + c1.cricketerName);
		System.out.println("jerseyNo:" + c1.jerseyNo);
		System.out.println("age:" + c1.age);
		System.out.println("countryName:" + countryName);
		System.out.println("boardName:" + boardName);
		System.out.println("------------------------------");

		Cricketer c2 = new Cricketer();
		c2.cricketerName = "rohit sharma";
		c2.jerseyNo = 32;
		c2.age = 26;
		System.out.println("cricketerName:" + c2.cricketerName);
		System.out.println("jerseyNo:" + c2.jerseyNo);
		System.out.println("age:" + c2.age);
		System.out.println("countryName:" + countryName);
		System.out.println("boardName:" + boardName);
		System.out.println("----------------------------");

	}

}
