package com.langfundamentals;

//import java.util.Scanner;

public class LoanManagement {

//static Scanner sc=new Scanner(System.in);	
	String customerName;
	double loanAmount;
	double interestRate;
	int loanTenure;
	double interest;
	double totalAmount;
	double emi;

	public static void main(String[] args) {
		LoanManagement l1 = new LoanManagement();

		l1.customerName = "Vennela";
		l1.loanAmount = 10000;
		l1.interestRate = 4;
		l1.loanTenure = 2;
		l1.calculateInterest();
		l1.calculateTotalAmount();
		l1.claculateMonthlyEMI();
		l1.displayLoanSummary();

	}

	double calculateInterest() {
		interest = (loanAmount * interestRate) / 100;
		return interest;

	}

	double calculateTotalAmount() {
		totalAmount = loanAmount + interest;
		return totalAmount;

	}

	double claculateMonthlyEMI() {
		emi = totalAmount / (loanTenure * 12);
		return emi;
	}

	void displayLoanSummary() {
		System.out.println("Enter customer Name   :" + customerName);
		System.out.println("Enter loan amount     :" + loanAmount);
		System.out.println("Enter rate of interest:" + interestRate);
		System.out.println("Enter loan tenure     :" + loanTenure);
		System.out.println("Enter total amount     :" + totalAmount);
		System.out.println("Enter interest     :" + interest);
		System.out.println("Enter monthly emi     :" + emi);

	}

}
