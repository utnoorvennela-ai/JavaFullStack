package com.oops;

import java.util.Scanner;

public class Employee1 {

	String ename;
	int empno;
	double sal;
	String designation;
	String companyname;

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getSal() {
		return sal;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getCompanyname() {
		return companyname;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee1 e1 = new Employee1();
		e1.setEname("Vennela");
		e1.setEmpno(101);
		e1.setSal(50000.00);
		e1.setDesignation("Software Engineer");
		e1.setCompanyname("Wipro");

		System.out.println("-----Employee details----");
		System.out.println("Employee name:" + e1.getEname());
		System.out.println("Employee number:" + e1.getEmpno());
		System.out.println("Employee salary:" + e1.getSal());
		System.out.println("Employee designation:" + e1.getDesignation());
		System.out.println("Employee company name:" + e1.getCompanyname());
		System.out.println();
		e1.modifySalary();
		System.out.println("Updated Salary:" + e1.getSal());

	}

	void modifySalary() {
		setSal(60000.00);
	}

}
