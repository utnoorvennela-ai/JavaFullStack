package com.oops.loanapp;

import java.util.Scanner;

public class LoanImpl implements Loan{

	static Scanner sc = new Scanner(System.in);
	
	@Override
	public double getEmployeeSalary() {
		System.out.println("Enter your salary:");
		double salary = sc.nextDouble();
		return salary;

	}
	@Override
	public int getCibilScore() {
		System.out.println("Enter your cibil score:");
		int cibil = sc.nextInt();
		return cibil;
	}
	
	@Override
	public double getROI() {
		double roi = 16.0;

		int cibil = getCibilScore();

		if (cibil > 800 && cibil <= 900) {
			System.out.println("Excellent:Strong credit profile,best loan terms");
			roi = roi - 6;//10
		} else if (cibil > 760 && cibil <= 800) {
			System.out.println("Very Good:High approval chances,compatative rates");
			roi = roi - 5;//11
		} else if (cibil > 700 && cibil <= 760) {
			System.out.println("Good:Eligible for most loans with decent terms");
			roi = roi - 4;//12
		} else if (cibil > 600 && cibil <= 700) {
			System.out.println("Average:May get loans but higher interest");
			roi = roi - 3;//13
		} else if (cibil >= 300 && cibil <= 600) {
			System.out.println("Poor:High risk;loan applications often rejected");
			roi = roi - 2;//14
		} else {
			System.out.println("Invalid cibil!!");
		}
		return roi;
	}

	// 4007 7944 7213
	@Override
	public boolean isAadharValid() {
		System.out.println("Enter your Aadhar card number:");
		String aadhar = sc.next();
		boolean aadharStatus = aadhar.matches("[2-9]{1}[0-9]{11}");
		return aadharStatus;
	}

	// ABCDE1234G
	@Override
	public boolean isPanValid() {
		System.out.println("Enter your Pan number:");
		String pan = sc.next();
		boolean panStatus = pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		return panStatus;
	}

	@Override
	public boolean isPhoneValid() {
		System.out.println("Enter your Phone number:");
		String phone = sc.next();
		boolean phoneStatus = phone.matches("[6-9]{1}[0-9]{9}");
		return phoneStatus;
	}

}
