package com.introduction;

public class RestaurantTable {
	static String restaurantName = "Devi Restaurant";
	int tableNumber;
	int seats;
	boolean reserved;

	static void changeRestName() {
		restaurantName = "paradise Restaurant";

	}

	static void displayRestName() {
		System.out.println("restaurantName:" + restaurantName);

	}

	void reserveTable() {
		reserved = true;
		System.out.println("table reserved");
	}

	void cancelResev() {
		reserved = false;
		System.out.println("table cancelled");
	}

	void disTableDetails() {
		System.out.println("restaurantName:" + restaurantName);
		System.out.println("tableNumber:" + tableNumber);
		System.out.println("seats:" + seats);
		System.out.println("reserved:" + reserved);
		System.out.println();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestaurantTable t1 = new RestaurantTable();
		RestaurantTable t2 = new RestaurantTable();

		t1.tableNumber = 101;
		t1.seats = 3;
		t1.reserved = false;

		t2.tableNumber = 102;
		t2.seats = 3;
		t2.reserved = true;

		changeRestName();

		t1.reserveTable();
		t1.disTableDetails();

		t2.cancelResev();
		t2.disTableDetails();

	}

}
