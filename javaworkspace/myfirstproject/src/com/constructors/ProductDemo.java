package com.constructors;

public class ProductDemo {
	int pid;
	String pname;
	double price;
	int quantity;

// No-Argument constructor
	ProductDemo() {
		pid = 101;
		pname = "laptop";
		price = 25000;
		quantity = 3;

	}

// parameterized  constructor
	ProductDemo(int pid, String pname, double price, int quantity) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
	}

	void display() {
		System.out.println(pid);
		System.out.println(pname);
		System.out.println(price);
		System.out.println(quantity);

	}

	public static void main(String[] args) {
		ProductDemo p1 = new ProductDemo();
		p1.display();

		ProductDemo p2 = new ProductDemo(102, "Mobile", 15000, 4);
		p2.display();

	}

}
