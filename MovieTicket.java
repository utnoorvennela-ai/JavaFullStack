package com.introduction;

public class MovieTicket {
	String movieName;
	int seatNumber;
	boolean booking;
	static String theatreName = "Vamshi";

	void bookTicket() {
		booking = true;

	}

	void cancelTicket() {
		booking = false;
		System.out.println("ticket cancelled");

	}

	void dispTicketDetails() {
		System.out.println("theatreName:" + theatreName);
		System.out.println("movieName:" + movieName);
		System.out.println("seatNumber:" + seatNumber);
		System.out.println("booking:" + booking);
		System.out.println("ticket booked");

	}

	static void changeTheatreName() {
		theatreName = "Brundhavani";

	}

	void dispTheatreName() {
		System.out.println("theatreName:" + theatreName);

	}

	public static void main(String[] args) {

		MovieTicket t1 = new MovieTicket();
		MovieTicket t2 = new MovieTicket();

		t1.movieName = "Maa Inti Bangaaram";
		t1.seatNumber = 101;
		t1.booking = false;

		t2.movieName = "Chennai LoveStory";
		t2.seatNumber = 102;
		t2.booking = true;

		changeTheatreName();

		t1.bookTicket();
		t1.dispTicketDetails();

		t2.cancelTicket();
		t2.dispTicketDetails();

	}

}
