package com.logicalstatements;

import java.util.Scanner;

public class DominozPizza {

	public static void main(String[] args) {

		System.out.println("Welcome to Dominoz.");

		Scanner sc = new Scanner(System.in);

		System.out.println("Please select pizza size(S/M/L):");
		char size = sc.next().toUpperCase().charAt(0);
		double price = getPizzaPrice(size);
		System.out.println("The pizza price is:" + price);

		System.out.println("Enter pizza quantity:");
		int qty = sc.nextInt();
		double pizzaCost = calculatePizzaCost(price, qty);
		System.out.println("The total cost is:" + pizzaCost);

		System.out.println("Please enter your distance:");
		double distance = sc.nextDouble();
		double deliveryCharge = calculateDeliveryCharge(distance);
		System.out.println("The delivery charge is:" + deliveryCharge);

		double finalBill = calculateFinalBill(pizzaCost, deliveryCharge);
		System.out.println("The final bill is: " + finalBill);
	}

	static double getPizzaPrice(char size) {
		double price = 0;
		if (size == 'S') {
			price = 70;
		} else if (size == 'M') {
			price = 100;

		} else if (size == 'L') {
			price = 150;

		} else {
			System.out.println("Invalid size!!");
		}
		return price;

	}

	static double calculatePizzaCost(double price, int quantity) {
		// double totalCost = 0;
		if (quantity <= 0) {
			return -1;

		} else {
			return price * quantity;
		}

	}

	static double calculateDeliveryCharge(double distance) {
		double deliveryCharge = 0;
		if (distance >= 0 && distance <= 10) {
			deliveryCharge = 70;
		} else if (distance >= 11 && distance <= 20) {
			deliveryCharge = 100;
		} else if (distance >= 21 && distance <= 100) {
			deliveryCharge = 150;
		} else {
			System.out.println("The distance is Invalid!!");
		}
		return deliveryCharge;

	}

	static double calculateFinalBill(double pizzaCost, double deliveryCharge) {
		return pizzaCost + deliveryCharge;

	}

}
