package com.constructors;

public class Car {
	String model;
	String brand;
	String color;
	double price;
	int year;

	Car(String model, String brand, String color, double price, int year) {
		System.out.println("5 parameterized constructor called!!");
		this.model = model;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.year = year;

	}

	Car(String model, String brand, String color) {
		System.out.println("3 parameterized constructor!!");
		this.model = model;
		this.brand = brand;
		this.color = color;

	}

	Car() {
		System.out.println("No-Argument constructor!!");

	}

	void display() {
		System.out.println("--------------------------");
		System.out.println("Model of the car:" + model);
		System.out.println("brand of the car:" + brand);
		System.out.println("color of the car:" + color);
		System.out.println("price of the car:" + price);
		System.out.println("year  of the car:" + year);
	}

	public static void main(String[] args) {
		Car c1 = new Car("Seltos", "KIA", "Red", 185000.00, 2026);
		c1.display();

		Car c2 = new Car("sonet", "KIA", "Red");
		c2.display();

		Car c3 = new Car();
		c3.display();

	}

}
