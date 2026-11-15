package com.oops;

public class Developer extends Employee {
	String programmingLanguage;

	void display() {
		System.out.println("Employee Id :" + employeeId);
		System.out.println("Employee Name :" + employeeName);
		System.out.println("Employee salary :" + salary);
		System.out.println("Employee programming Language :" + programmingLanguage);

	}

	public static void main(String[] args) {

		Developer d = new Developer();

		d.employeeId = 101;
		d.employeeName = "Vennela";
		d.salary = 50000.00;
		d.programmingLanguage = "Java Full Stack";

		d.display();
	}

}
