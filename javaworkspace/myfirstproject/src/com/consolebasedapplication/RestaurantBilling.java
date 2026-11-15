package com.consolebasedapplication;

import java.util.Scanner;

public class RestaurantBilling {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double totalPrice = 0;
		double startersPrice = 0;
		double maincoursePrice = 0;
		double dessertPrice = 0;
		String yn = "";

		do {

			System.out.println("Enter a category:");
			String catg = sc.next();
			switch (catg) {

			case "Starters" -> {

				do {

					System.out.println("Enter a starter item:");
					String sItem = sc.next();

					switch (sItem) {

					case "Chicken" -> {
						System.out.println("The chicken price is 150rs");
						startersPrice = startersPrice + 150;
					}

					case "Paneer" -> {
						System.out.println("The paneer price is 120rs");
						startersPrice = startersPrice + 120;
					}

					case "Gobi Machurian" -> {
						System.out.println("The Gobi Manchurian price is 80rs");
						startersPrice = startersPrice + 80;
					}
					default -> System.out.println("The entered starter item is not avilable");

					}

					System.out.println("do you want to continue with starters..? Click y for yes,n for no");
					yn = sc.next();

				} while (yn.equalsIgnoreCase("y"));
				System.out.println("The starters total price is:" + startersPrice);
			}

			case "MainCourse" -> {

				do {

					System.out.println("Enter the maincourse  item:");
					String mcItem = sc.next();

					switch (mcItem) {

					case "ChickenBiryani" -> {
						System.out.println("The chicken biryani price is 180rs");
						maincoursePrice = maincoursePrice + 180;
					}

					case "PaneerBiryani" -> {
						System.out.println("The paneer Biryani price is 210rs");
						maincoursePrice = maincoursePrice + 210;
					}

					case "MuttonBiryani" -> {
						System.out.println("The mutton biryani price is 260rs");
						maincoursePrice = maincoursePrice + 260;
					}
					default -> System.out.println("The entered main course is not available!!");

					}

					System.out.println("do you want to continue with MainCourse..? Click y for yes,n for no");
					yn = sc.next();

				} while (yn.equalsIgnoreCase("y"));
				System.out.println("The main course total price is:" + maincoursePrice);
			}

			case "Desserts" -> {

				do {

					System.out.println("Enter the dessert item:");
					String dItem = sc.next();

					switch (dItem) {

					case "icecream" -> {
						System.out.println("The ice cream price is 60rs");
						dessertPrice = dessertPrice + 60;
					}

					case "FruitSalad" -> {
						System.out.println("The fruit salad price is 40rs");
						dessertPrice = dessertPrice + 40;
					}

					case "GulabJamun" -> {
						System.out.println("The gulab jamun price is 30rs");
						dessertPrice = dessertPrice + 30;
					}

					default -> System.out.println("the entered dessert item is not available!!");

					}

					System.out.println("do you want to continue with desserts..? Click y for yes,n for no");
					yn = sc.next();

				} while (yn.equalsIgnoreCase("y"));
				System.out.println("The desserts total price is:" + dessertPrice);

			}

			default -> System.out.println("The entered category is not availaable!!");

			}

			System.out.println("do you want to continue with category..? Click y for yes,n for no");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));
		totalPrice = startersPrice + maincoursePrice + dessertPrice;
		System.out.println("The total price is:" + totalPrice);

		System.out.println("-------- Final Bill---------");
		System.out.println("The Staters total price is :" + startersPrice);
		System.out.println("The MainCourse total Price is :" + maincoursePrice);
		System.out.println("The Dessert total Price is :" + dessertPrice);
		System.out.println("The total price is :" + totalPrice);

	}
}
