package com.constructors;

public class Bike {
	String model;
	String brand;
	String color;
	double price;
	int year;

	Bike() {
		this("UNKNOWN");
		System.out.println("no arg constructor called!!");

	}

	Bike(String model) {
		System.out.println("one Arg Constructor Called!!");
		this(model, "UNKNOWN");

	}

	Bike(String model, String brand) {
		System.out.println("Two Arg Constructor Called!!");
		this(model, brand,"UNKNOWN");

	}

	Bike(String model, String brand, String color) {
		System.out.println("Three Arg Constructor Called!!");
		this.model = model;
		this.brand = brand;
		this.color = color;
	}

	Bike(String model, String brand, String color, double price) {
		System.out.println("Four Arg Constructor Called!!");
		this.model = model;
		this.brand = brand;
		this.color = color;
		this.price = price;

	}

	Bike(String model, String brand, String color, double price, int year) {
		System.out.println(" five Parameterized Constructor Called!!");
		this.model = model;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.year = year;

	}

	public static void main(String[] args) {

		Bike b1 = new Bike();
		b1.display();

		Bike b7 = new Bike("KTM");
		b7.display();

//		Bike b2 = new Bike("KTM", "Duke 125");
//		b2.display();
//
//		Bike b3 = new Bike("KTM", "Duke 125", "Black");
//		b3.display();
//
//		Bike b4 = new Bike("KTM", "Duke 125", "Blue", 180000);
//		b4.display();
//
//		Bike b6 = new Bike("KTM", "Duke 125", "white", 150000, 2026);
//		b6.display();
	}

	void display() {

		System.out.println("------------------------------");
		System.out.println("model of the bike is:" + model);
		System.out.println("brand of the bike is:" + brand);
		System.out.println("color of the bike is:" + color);
		System.out.println("price of the bike is:" + price);
		System.out.println("year of the bike is:" + year);

	}

}
