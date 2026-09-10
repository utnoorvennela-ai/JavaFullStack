package com.introduction;

public class ShoppingCart {
	int items;
	double totalAmount;
	String orderPlaced = "Yes";
	static String website = "Pizzahut";

	void addItem() {
		items++;

	}

	void placeOrder() {
		orderPlaced = "Yes";

	}

	void displayCart() {
		System.out.println("website:" + website);
		System.out.println("items:" + items);
		System.out.println("totalAmount:" + totalAmount);
		System.out.println("orderPlaced:" + orderPlaced);

	}

	static void changeWebsite() {
		website = "KFC";

	}

	static void displayWebsite() {
		System.out.println("website:" + website);

	}

	public static void main(String[] args) {
		ShoppingCart s1 = new ShoppingCart();
		ShoppingCart s2 = new ShoppingCart();

		changeWebsite();
		s1.items = 2;
		s1.totalAmount = 340;

		s1.placeOrder();
		s1.displayCart();

		System.out.println("-------------------");

		s2.items = 3;
		s2.totalAmount = 500;

		s2.addItem();
		s2.displayCart();

	}

}
