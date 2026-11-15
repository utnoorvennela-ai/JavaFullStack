package com.oops;

class Device {
	private String brand;
	private int price;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	void displayDetails() {
		System.out.println("Brand:" + getBrand());
		System.out.println("Price:" + getPrice());

	}
}

class Laptop extends Device {
	String ram;
	String processor;

	public Laptop(String ram, String processor) {
		this.ram = ram;
		this.processor = processor;
	}

	void runIDE() {
		System.out.println("Running code");
	}

	void compileCode() {
		System.out.println("Compile java code");
	}

	void displayDetails() {
		System.out.println("======Laptop Details=====");
		System.out.println("Brand:" + getBrand());
		System.out.println("Price:" + getPrice());
		System.out.println("Ram:" + ram);
		System.out.println("Processor:" + processor);

	}
}

class Mobile extends Device {
	String camera;
	String battery;

	public Mobile(String camera, String battery) {
		this.camera = camera;
		this.battery = battery;
	}

	void makeCall() {
		System.out.println("Making a phone call");
	}

	void takePhoto() {
		System.out.println("Taking a photo");
	}

	void displayDetails() {
		System.out.println("=====Mobile Details=====");
		System.out.println("Brand:" + getBrand());
		System.out.println("Price:" + getPrice());
		System.out.println("Camera:" + camera);
		System.out.println("Battery:" + battery);

	}

}

public class Vcube {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("16GB", "Intel Core i5");
		l1.setBrand("Dell");
		l1.setPrice(50000);
		l1.displayDetails();
		l1.runIDE();
		l1.compileCode();
		System.out.println();

		Mobile m1 = new Mobile("50MP", "5000mAh");
		m1.setBrand("Oppo");
		m1.setPrice(60000);
		m1.displayDetails();
		m1.makeCall();
		m1.takePhoto();

	}

}
