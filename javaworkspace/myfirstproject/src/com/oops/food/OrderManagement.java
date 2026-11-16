package com.oops.food;

public class OrderManagement {
	public static void main(String[] args) {
		Order o1 = new PizzaOrder(101, "Lahari", 3);
		Order o2 = new BiryaniOrder(103, "Abhi", 4);
		Order o3 = new BurgerOrder(102, "Rasagna", 2);

		System.out.println("====Pizza Order Details=====");
		o1.displayDetails();
		System.out.println();

		System.out.println("=====Biryani Order Details=====");
		o2.displayDetails();
		System.out.println();

		System.out.println("=====Burger Order Details=====");
		o3.displayDetails();
		System.out.println();
	}
}
