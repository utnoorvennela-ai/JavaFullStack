package com.oops.loanapp;

import java.util.Scanner;

public class PersonalLoan extends LoanImpl {

	static Scanner sc = new Scanner(System.in);

	void getPersonalLoanDocumentInfo() {
		System.out.println("All documents have been received successfully");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube personal loan banking");
		// scenario:4
		// By using parent object child reference
		// we cannot store parent object into child reference
		// CE:Type mismatch: cannot convert from Loan to PersonalLoan
		// Down-casting is not possible directly,but we can with the help of Explicit type casting.
		// Just for compiler satisfaction,but we will get runtime exception like ClassCastException
		//PersonalLoan pl2 = new Loan();

//		PersonalLoan pl2 = (PersonalLoan) new LoanImpl();
//		pl2.getCibilScore();
//		pl2.getPersonalLoanDocumentInfo();
		
		// scenario:3
		// By using child object parent reference,
		// we can access only parent class functionalities
		LoanImpl l2 = new PersonalLoan();
		// scenario:2
		// By using parent object parent reference,
		// we can access only parent class functionalities
		Loan l1 = new LoanImpl();
		// Scenario:1
		// By using child reference child object,
		// we can access both parent & child class functionalities.
		PersonalLoan pl = new PersonalLoan();
		double salary = pl.getEmployeeSalary();
		int cibil = pl.getCibilScore();
		if (salary >= 1000000.00 && cibil >= 300 && cibil <= 900) {
			System.out.println("Lets check more details:");
			if (pl.isAadharValid() && pl.isPanValid() && pl.isPhoneValid()) {
				System.out.println("COngratulations!! Your Personal loan got approved!!");
				System.out.println("Your loan rate of interest is:" + pl.getROI());
				pl.getPersonalLoanDocumentInfo();
			} else {
				System.out.println("Something went wrong with personal details! can you re-check");
			}
		} else {
			System.out.println("Your Personal loan got rejected!!");
		}
	}
}
