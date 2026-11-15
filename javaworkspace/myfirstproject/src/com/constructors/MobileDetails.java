package com.constructors;

public class MobileDetails {
	String brand;
	String model;
	double price;
	String ram;

	MobileDetails() {
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
		System.out.println(ram);
	}

	MobileDetails(String brand, String model, double price, String ram) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.ram = ram;
	}

	public static void main(String[] args) {
		MobileDetails m1 = new MobileDetails();
		m1.brand = "Apple";
		m1.model = "iphone15";
		m1.price = 120000;
		m1.ram = "6GB";
		System.out.println(m1.brand);
		System.out.println(m1.model);
		System.out.println(m1.price);
		System.out.println(m1.ram);

		MobileDetails m2 = new MobileDetails("Samsung", "Galaxy S24", 15000, "8GB");

		System.out.println(m2.brand);
		System.out.println(m2.model);
		System.out.println(m2.price);
		System.out.println(m2.ram);

	}

}
