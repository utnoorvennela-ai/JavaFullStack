package com.oops;

class Shape {
	double height;
	double breadth;

	void area() {
		System.out.println("Shapes");
	}
}

class Circle extends Shape {
	double radius;// 3.14*r^2

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	void area() {
		System.out.println("Ares of Circle:" + 3.14 * radius * radius);

	}

}

class Rectangle extends Shape {
	int length;
	int breadth;// l*b

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	void area() {
		System.out.println("Ares of Rectangle:" + length * breadth);

	}

}

class Triangle extends Shape {
	int breadth;
	int height;// 1/2*b*h

	Triangle(int breadth, int height) {
		this.breadth = breadth;
		this.height = height;
	}

	@Override
	void area() {
		System.out.println("Ares of Triangle:" +(breadth * height)/2);
	}

}

class Square extends Shape {
	int side;// 1/2*b*h

	Square(int side) {
		this.side = side;

	}

	@Override
	void area() {
		System.out.println("Ares of square:" + side * side);
	}

}

public class ShapeDemo {
	public static void main(String[] args) {
		Shape c = new Circle(5);
		Shape r = new Rectangle(8, 3);
		Shape t = new Triangle(5, 6);
		Shape s = new Square(5);
		c.area();
		r.area();
		t.area();
		s.area();

	}
}
