package com.oops;

class Employee2 {
	String name;
	Integer id;
//	double salary;

	Employee2(String name, Integer id) {
		this.name = name;
		this.id = id;
//		this.salary = salary;
	}

	double calculateSalary() {
		return 0;
	}

	void display() {
		System.out.println("Employee name:" + name);
		System.out.println("Employee id:" + id);
		System.out.println("Employee salary:" + calculateSalary());

	}

}

class permanentEmployee extends Employee2 {
	double salary;
	double hra;

	permanentEmployee(String name, Integer id, double salary, double hra) {
		super(name, id);
		this.salary = salary;
		this.hra = hra;
	}

	@Override
	double calculateSalary() {
		return salary + hra;
	}

}

class contractEmployee extends Employee2 {
	int hoursWorked;
	double hourlyRate;

	contractEmployee(String name, Integer id, int hoursWorked, double hourlyRate) {
		super(name, id);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	double calculateSalary() {
		return hoursWorked * hourlyRate;
	}

}

public class PayrollSystem {

	public static void main(String[] args) {
		Employee2 e1 = new permanentEmployee("Vennela", 101, 30000, 10000);
		System.out.println("----- Permanent Employee Details -----");
		e1.display();
//	    e1.calculateSalary();

		System.out.println();

		Employee2 e2 = new contractEmployee("Lahari", 102, 120, 500);
		System.out.println("----- Contract Employee Details -----");
		e2.display();
//	    e2.calculateSalary();

	}

}
