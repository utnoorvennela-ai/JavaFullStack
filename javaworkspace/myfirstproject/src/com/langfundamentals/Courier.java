package com.langfundamentals;

public class Courier {
	String customerName;
	Integer courierId;
	String source;
	String destination;
	Integer weight;
	Integer deliveryAmount = 0;
	static Integer totalCouriers = 0;
	static Integer totalWeight = 0;
	static Integer totalAmountCollected = 0;
	static Integer pricePerkg = 100;

	static {
		System.out.println("Welcome to Quickship courier!");
	}

	void bookCourier() {
		totalCouriers++;
		deliveryAmount = weight * pricePerkg;
		totalWeight = totalWeight + weight;
		totalAmountCollected = totalAmountCollected + deliveryAmount;

		System.out.println("Your booking is successful");

	}

	void displayCourierDetails() {
		System.out.println("customerName:" + customerName);
		System.out.println("courierId:" + courierId);
		System.out.println("source:" + source);
		System.out.println("destination:" + destination);
		System.out.println("weight:" + weight);
		System.out.println("deliveryAmount:" + deliveryAmount);
		System.out.println("pricePerkg:" + pricePerkg);
		System.out.println("---------------------------------");

	}

	static void displayTodaysCollection() {
		System.out.println("totalCouriers:" + totalCouriers);
		System.out.println("totalWeight:" + totalWeight);
		System.out.println("totalAmountCollected:" + totalAmountCollected);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Courier c1 = new Courier();
		Courier c2 = new Courier();

		c1.customerName = "Vennela";
		c1.courierId = 101;
		c1.source = "Armoor";
		c1.destination = "Metpally";
		c1.weight = 3;
		c1.deliveryAmount = 250;

		c2.customerName = "Lahari";
		c2.courierId = 102;
		c2.source = "Metpally";
		c2.destination = "Armoor";
		c2.weight = 4;
		c2.deliveryAmount = 300;

		c1.bookCourier();
		c1.displayCourierDetails();

		c2.bookCourier();
		c2.displayCourierDetails();

		displayTodaysCollection();
	}

}
