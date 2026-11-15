package com.langfundamentals;

public class DigitalWatch {
	String brandName;
	String watchType;
	Integer hours;
	Integer minutes;
	Integer seconds;
	Integer price;

	void displayTime() {
		System.out.println("Time:" + hours + ":" + minutes + ":" + seconds);

	}

	void displayWatchDetails() {
		System.out.println("brandName:" + brandName);
		System.out.println("watchType:" + watchType);
		System.out.println("price    :" + price);

	}

	void updateHours() {
		hours = hours + 1;
		System.out.println("*****Time is updated******");

	}

	void updateMinutes() {
		minutes = minutes + 1;
		// minutes+=1;
		// minutes++;

	}

	public static void main(String[] args) {

		DigitalWatch d1 = new DigitalWatch();
		DigitalWatch d2 = new DigitalWatch();

		d1.brandName = "Casio";
		d1.watchType = "Digital";
		d1.hours = 11;
		d1.minutes = 55;
		d1.seconds = 25;
		d1.price = 2000;

		d2.brandName = "Rolex";
		d2.watchType = "Luxury";
		d2.hours = 11;
		d2.minutes = 50;
		d2.seconds = 45;
		d2.price = 2500;

		d1.displayWatchDetails();
		d1.updateHours();
		d1.updateMinutes();
		d1.displayTime();

		d2.displayWatchDetails();
		d2.updateHours();
		d2.updateMinutes();
		d2.displayTime();

	}

}
