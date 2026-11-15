package com.logicalstatements;

import java.util.Scanner;

public class GroceryStore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double totalPrice = 0;
		double fruitsTotal = 0;
		double vegTotal = 0;
		String yn = "";

		do {
			System.out.println("Enter Category");
			String catg = sc.next();

			switch (catg) {

			case "fruits" -> {

				do {
					System.out.println("Enter fruits:");
					String fruit = sc.next();

					switch (fruit) {

					case "Mango" -> {
						System.out.println("Mangos per KG is 40rs");
						fruitsTotal = fruitsTotal + 40;
					}

					case "Apple" -> {
						System.out.println("Apples per KG is 120rs");
						fruitsTotal = fruitsTotal + 120;
					}
					case "Banana" -> {
						System.out.println("Bananas per KG is 60rs");
						fruitsTotal = fruitsTotal + 60;
					}
					case "Grapes" -> {
						System.out.println("Grapes per KG is 90rs");
						fruitsTotal = fruitsTotal + 90;
					}
					case "Oranges" -> {
						System.out.println("Oranges per KG is 150rs");
						fruitsTotal = fruitsTotal + 150;
					}

					default -> System.out.println("Your entered fruit is not avilable");
					}
					System.out.println("Do you want to continue with fruits..? Click y for yes & n for no");
					yn = sc.next();

				} while (yn.equalsIgnoreCase("y"));
				System.out.println("Fruits Total price is:" + fruitsTotal);

			}

			case "vegitables" -> {

				do {
					System.out.println("Enter vegitable:");
					String veg = sc.next();
					switch (veg) {

					case "Tomato" -> {
						System.out.println("Tomatos per Kg is 40rs");
						vegTotal = vegTotal + 40;
					}

					case "Potato" -> {
						System.out.println("Potatos per Kg is 20rs");
						vegTotal = vegTotal + 20;
					}

					case "Brinjal" -> {
						System.out.println("Brinjals per KG is 100rs");
						vegTotal = vegTotal + 100;

					}

					case "Carrot" -> {
						System.out.println("Carrots per KG is 150rs");
						vegTotal = vegTotal + 150;
					}
					default -> System.out.println("Your entered vegitable is not avilable");
					}
					System.out.println("Do you want to continue with vegitable..? Click y for yes & n for no");
					yn = sc.next();

				} while (yn.equalsIgnoreCase("y"));
				System.out.println("Vegitables Total Price:" + vegTotal);

			}

			default -> System.out.println("Enter a valid Category");

			}
			System.out.println("Do you want to continue with category..? Click y for yes & n for no");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));
		totalPrice = fruitsTotal + vegTotal;
		System.out.println("The total price is:" + totalPrice);
		System.out.println("-------- Final Bill---------");
		System.out.println("The Fruits Total Price is:" + fruitsTotal);
		System.out.println("The Vegitables Total Price is:" + vegTotal);
		System.out.println("The Final Bill is:" + totalPrice);
		System.out.println("Exit");

	}

}
