package com.langfundamentals;

import java.util.Scanner;
import java.math.BigInteger;

public class JavaMethods {

	public static void main(String[] args) {
		System.out.println("main method started");
		JavaMethods m1 = new JavaMethods();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer id:");
		int cid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter customer name:");
		String cname = sc.nextLine();
		System.out.println("Enter address:");
		String address = sc.next();
		System.out.println("Enter number:");
		BigInteger number = sc.nextBigInteger();

		System.out.println("Enter bookid:");
		int bookid = sc.nextInt();
		System.out.println("Enter price:");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter bookName:");
		String bookName = sc.nextLine();
		System.out.println("EnterpublishedYear :");
		int publishedYear = sc.nextInt();

		m1.Customer_Info(cid, cname, address, number);
		m1.book_Info(bookid, price, bookName, publishedYear);
		System.out.println("main method ended!!");
	}

	void Customer_Info(int cid, String cname, String address, BigInteger number) {
		System.out.println(cid);
		System.out.println(cname);
		System.out.println(address);
		System.out.println(number);

	}

	void book_Info(int bookid, int price, String bookName, int publishedYear) {
		System.out.println(bookid);
		System.out.println(price);
		System.out.println(bookName);
		System.out.println(publishedYear);

	}

}
