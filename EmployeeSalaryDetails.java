package com.introduction;

public class EmployeeSalaryDetails {
	String employeeName = "sahithi";
	int monthlySalary = 5000;
	double monthlyGST;
	double monthlyPF;
	double netMonthlySalary;
	double annualGST;
	double annualPF;
	double annualNetSalary;

	void calMonthlyPF() {
		monthlyPF = monthlySalary * 2 / 100;

	}

	void calMonthlyGST() {
		monthlyGST = monthlySalary * 3 / 100;

	}

	void calNetMonthlySalary() {
		netMonthlySalary = monthlySalary - monthlyGST - monthlyPF;

	}

	void calAnnualGST() {
		annualGST = monthlyGST * 12;

	}

	void calAnnualPF() {
		annualPF = monthlyPF * 12;

	}

	void calAnnualNetSalary() {
		annualNetSalary = netMonthlySalary * 12;

	}

	void disEmployeeDetails() {
		System.out.println("employeeName:" + employeeName);
		System.out.println("monthlySalary:" + monthlySalary);
		System.out.println("monthlyGST:" + monthlyGST);
		System.out.println("monthlyPF:" + monthlyPF);
		System.out.println("netMonthlySalary:" + netMonthlySalary);
		System.out.println(" annualGST:" + annualGST);
		System.out.println("annualPF:" + annualPF);
		System.out.println("annualNetSalary:" + annualNetSalary);

	}

	public static void main(String[] args) {
		EmployeeSalaryDetails e1 = new EmployeeSalaryDetails();

		e1.calMonthlyGST();
		e1.calMonthlyPF();
		e1.calNetMonthlySalary();
		e1.calAnnualGST();
		e1.calAnnualPF();
		e1.calAnnualNetSalary();
		e1.disEmployeeDetails();

	}

}
