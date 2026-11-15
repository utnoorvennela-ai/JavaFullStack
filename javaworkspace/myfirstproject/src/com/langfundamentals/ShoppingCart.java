package com.langfundamentals;

import java.util.Scanner;

public class ShoppingCart {
	static String storeName = "D-Mart";
	String customerName;
	String productName;
	double price;
	int quantity;
	double finalAmount;

	void addProduct(String pname, double pr, int qty) {
		productName = pname;
		price = pr;
		quantity = qty;

		System.out.println("Your product added successfully");

	}

	void calculateTotal(double discount) {
		double total = price * quantity;
		double discountAmount = total * discount / 100;
		finalAmount = total - discountAmount;

	}

	void displayCart() {
		System.out.println("enter Store name:" + storeName);
		System.out.println("enter Customer name:" + customerName);
		System.out.println("enter product name:" + productName);
		System.out.println("enter price:" + price);
		System.out.println("enter quantity:" + quantity);
		System.out.println("enter finalAmount:" + finalAmount);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ShoppingCart s1 = new ShoppingCart();

		System.out.println("Enter customer name:");
		s1.customerName = sc.next();
		System.out.println("Enter product name:");
		String pname = sc.next();
		System.out.println("enter product price:");
		int pr = sc.nextInt();
		System.out.println("enter product quantity:");
		int qty = sc.nextInt();
		System.out.println("Enter discount percentage:");
		double discount = sc.nextDouble();

		s1.addProduct(pname, pr, qty);
		s1.calculateTotal(discount);
		s1.displayCart();
		System.out.println("-----------------------");

	}

}
