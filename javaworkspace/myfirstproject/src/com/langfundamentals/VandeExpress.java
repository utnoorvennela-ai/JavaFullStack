package com.langfundamentals;

public class VandeExpress {
	String passengerName;
	Integer age;
	String source;
	String destination;
	Integer numberofTickets = 0;
	static Integer totalTicketsBought = 0;
	static Integer totalAmountCollected = 0;
	static Integer totalAmount = 0;
	static Integer price = 500;

	static {
		System.out.println("Welcome to Vande Express thank you for choosing us");
	}

	void bookTicket() {
		totalTicketsBought = totalTicketsBought + numberofTickets;
		totalAmount = price * numberofTickets;
		totalAmountCollected = totalAmountCollected + totalAmount;

		System.out.println("your ticket is booking successfully ");

	}

	void dispBookingDetails() {
		System.out.println("passengerName:" + passengerName);
		System.out.println("source:" + source);
		System.out.println("destination:" + destination);

		System.out.println("age:" + age);
		System.out.println("noofTickets:" + numberofTickets);
		System.out.println("totalAmount:" + totalAmount);
		System.out.println("--------------------------------");

	}

	static void ticketCounter() {
		System.out.println("totalTickets:" + totalTicketsBought);
		System.out.println("totalAmountCollected:" + totalAmountCollected);

	}

	public static void main(String[] args) {

		VandeExpress v1 = new VandeExpress();
		VandeExpress v2 = new VandeExpress();

		v1.passengerName = "Vennela";
		v1.source = "Hyderabad";
		v1.destination = "Tirupathi";
		v1.age = 22;
		v1.numberofTickets = 2;

		v2.passengerName = "Lahari";
		v2.source = "Hyderabad";
		v2.destination = "Yadagiri";
		v2.age = 21;
		v2.numberofTickets = 3;

		v1.bookTicket();
		v1.dispBookingDetails();

		v2.bookTicket();
		v2.dispBookingDetails();

		ticketCounter();
	}

}
