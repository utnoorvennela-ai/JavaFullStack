package com.oops;

public class Vehicle {
	String name;
	String speed;

	Vehicle(String name, String speed) {
		this.name = name;
		this.speed = speed;

	}

	void start() {
		System.out.println("is starting");
	}

	void stop() {
		System.out.println("is stopping");
		System.out.println();
	}

	void display() {
		System.out.println("Vehicle name:" + name);
		System.out.println("Vehicle speed:" + speed);
	}

	public static void main(String[] args) {
		Car c = new Car("CAR", "50km/hr");
		c.display();
		c.start();
		c.sunRoof();
		c.stop();

		Bike b = new Bike("CAR", "50km/hr");
		b.display();
		b.start();
		b.doWheelie();
		b.stop();

		Truck t = new Truck("CAR", "50km/hr");
		t.display();
		t.start();
		t.loadCargo();
		t.stop();

	}

}

class Car extends Vehicle {
	Car(String name, String speed) {
		super(name, speed);
	}

	void sunRoof() {
		System.out.println("is opening sunroof");
	}
}

class Bike extends Vehicle {
	Bike(String name, String speed) {
		super(name, speed);
	}

	void doWheelie() {
		System.out.println("is doing wheelie");
	}

}

class Truck extends Vehicle {
	Truck(String name, String speed) {
		super(name, speed);

	}

	void loadCargo() {
		System.out.println("is loading cargo");
	}

}
