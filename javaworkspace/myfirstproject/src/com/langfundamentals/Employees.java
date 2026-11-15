package com.langfundamentals;

public class Employees {
	String employeeName;
	Integer employeeId;
	String designation;
	String department;
	Integer salary;
	String remoteLocation;

	static String companyName = "SunTech Solutions";
	static String companyLocation = "Hi-Tech City";

	static {
		System.out.println("Welcome to SunTech Solutions! Employee HRMS Portal");
	}

	void displayEmployeeDetails() {
		System.out.println("employeeName    :" + employeeName);
		System.out.println("employeeId      :" + employeeId);
		System.out.println("designation     :" + designation);
		System.out.println("department      :" + department);
		System.out.println("salary          :" + salary);
		System.out.println("remoteLocation  :" + remoteLocation);

	}

	String promoteEmployee(String newdesignation) {
		designation = newdesignation;
		return designation;
	}

	int updateSalary(int esalary) {
		salary = salary + esalary;
		return salary;
	}

	String updateEmployeeLocation(String newremotelocation) {
		remoteLocation = newremotelocation;
		return remoteLocation;

	}

	public static void main(String[] args) {
		Employees e1 = new Employees();

		e1.employeeName = "Vennela";
		e1.employeeId = 101;
		e1.designation = "Java Developer";
		e1.department = "IT";
		e1.salary = 50000;
		e1.remoteLocation = "Hyderabad";

		e1.displayEmployeeDetails();

		e1.promoteEmployee("Senior Java Developer");
		e1.updateSalary(5000);
		e1.updateEmployeeLocation("Bangalore");

		System.out.println("-------------updated Details-----------");
		e1.displayEmployeeDetails();

	}

}
