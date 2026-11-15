package com.oops;

class StudentClass {
	int rollNumber;
	String name;
	String className;

	public StudentClass(int rollNumber, String name, String className) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.className = className;
	}

	void display() {
		System.out.println("Roll Number:" + rollNumber);
		System.out.println("Name:" + name);
		System.out.println("class Name:" + className);

	}
}

class ScienceStudent extends StudentClass {
	int biology;
	int physics;

	public ScienceStudent(int rollNumber, String name, String className, int biology, int physics) {
		super(rollNumber, name, className);
		this.biology = biology;
		this.physics = physics;
	}

	int calculateTotal() {
		return biology + physics;
	}

	double calculatePercentage() {
		return calculateTotal() / 2.0;
	}

	void checkResult() {
		System.out.println("Category:Science");
		System.out.println("Total Marks:" + calculateTotal());
		System.out.println("Percentage:" + calculatePercentage() + "%");
		if (biology >= 35 && physics >= 35) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
	}
}

class CommerceStudent extends StudentClass {
	int accounts;
	int economics;

	public CommerceStudent(int rollNumber, String name, String className, int accounts, int economics) {
		super(rollNumber, name, className);
		this.accounts = accounts;
		this.economics = economics;
	}

	int calculateTotal() {
		return accounts + economics;
	}

	double calculatePercentage() {
		return calculateTotal() / 2.0;
	}

	void checkResult() {
		System.out.println("Category:Commerce");
		System.out.println("Total Marks:" + calculateTotal());
		System.out.println("Percentage:" + calculatePercentage() + "%");
		if (accounts >= 35 && economics >= 35) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
	}
}

class ArtsStudent extends StudentClass {
	int history;
	int geography;

	public ArtsStudent(int rollNumber, String name, String className, int history, int geography) {
		super(rollNumber, name, className);
		this.history = history;
		this.geography = geography;
	}

	int calculateTotal() {
		return history + geography;
	}

	double calculatePercentage() {
		return calculateTotal() / 2.0;
	}

	void checkResult() {
		System.out.println("Category:Arts");
		System.out.println("Total Marks:" + calculateTotal());
		System.out.println("Percentage:" + calculatePercentage() + "%");
		if (history >= 35 && geography >= 35) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
	}
}

public class SchoolExaminationSystem {

	public static void main(String[] args) {
		StudentClass s1 = new ScienceStudent(101, "Vennela", "10th", 60, 60);
		System.out.println("=====Science Student=====");
		s1.display();
		((ScienceStudent) s1).checkResult();
		System.out.println();

		StudentClass s2 = new CommerceStudent(102, "Nandhini", "10th", 75, 80);
		System.out.println("=====Commerce Student=====");
		s2.display();
		((CommerceStudent) s2).checkResult();
		System.out.println();

		StudentClass s3 = new ArtsStudent(103, "Lahari", "10th", 60, 70);
		System.out.println("=====Arts Student=====");
		s3.display();
		((ArtsStudent) s3).checkResult();
		System.out.println();
	}
}
