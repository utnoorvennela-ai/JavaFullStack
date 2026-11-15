package com.langfundamentals;

import java.util.Scanner;
//import java.util.Arrays;
import java.math.BigInteger;

public class TypesOfMethodsDemo4 {

	public static void main(String[] args) {

		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student id:");
		int sid = sc.nextInt();
		System.out.println("Enter student name:");
		String sname = sc.next();
		//String sname = sc.nextLine();
		System.out.println("Enter student Age:");
		int age = sc.nextInt();
		System.out.println("Enter student phone number:");
		BigInteger phonenumber = sc.nextBigInteger();

		getStudent_Id_Name_Info(sid, sname);
		getStudent_age_Info(age, phonenumber);
		System.out.println("main method ended");

	}

	static void getStudent_age_Info(int age, BigInteger phonenumber) {
		System.out.println(age);
		System.out.println(phonenumber);

	}

	static void getStudent_Id_Name_Info(int sid, String sname) {
		System.out.println(sid);
		System.out.println(sname);

	}

}
