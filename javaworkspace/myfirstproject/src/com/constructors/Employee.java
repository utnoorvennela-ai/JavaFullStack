package com.constructors;

public class Employee {
	int eid;
	String ename;
	String department;
	int salary;

	Employee() {
		System.out.println("No-arg constructor called");
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(department);
		System.out.println(salary);
	}

	Employee(int eid, String ename, String department, int salary) {
		System.out.println("Parameterized constructor called");
		this.eid = eid;
		this.ename = ename;
		this.department = department;
		this.salary = salary;
	}

	public static void main(String[] args) {
		System.out.println("Employee Information ");
		Employee e = new Employee();
		e.eid = 101;
		e.ename = "Vennela";
		e.department = "Software";
		e.salary = 50000;
		System.out.println(e.eid);
		System.out.println(e.ename);
		System.out.println(e.department);
		System.out.println(e.salary);

		Employee e1 = new Employee(102, "Lahari", "DBA", 40000);
		System.out.println(e1.eid);
		System.out.println(e1.ename);
		System.out.println(e1.department);
		System.out.println(e1.salary);

	}

}
