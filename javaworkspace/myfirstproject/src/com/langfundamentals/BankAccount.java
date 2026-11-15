package com.langfundamentals;

import java.util.Scanner;

public class BankAccount {
	long accountNumber;
	String customerName;
	double balance;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		System.out.println("Enter the Account number :");
		b1.accountNumber = sc.nextLong();
		System.out.println("Enter customer name :");
		sc.nextLine();
		b1.customerName = sc.nextLine();
		System.out.println("Enter initial balance:");
		b1.balance = sc.nextDouble();

		System.out.println("The deposited amount is: " + b1.deposite(0));
		System.out.println("The withdraw Amount is: " +  b1.withdraw(0));
		System.out.println("The Calculated Amount  : " + b1.calculateInterest(0));

		BankAccount b2 = new BankAccount();
		b2.accountNumber = 12334;
		b2.customerName = "laharika";
		b2.balance = 10000;
		System.out.println("Enter Amount to transfer  :  ");
		double transferAmount=sc.nextDouble();
		System.out.println("b2 balance after transfer  : " + b1.transfer(b2, transferAmount));
		System.out.println("b1 balance after transfer  : " + b1.balance);

	}

	double deposite(double amount) {
		System.out.println("Enter amount to deposite: ");
		amount = sc.nextDouble();
		balance = balance + amount;
		return balance;

	}

	double withdraw(double wAmount) {
		System.out.println("Enter amount to withdraw: ");
		wAmount = sc.nextDouble();
		balance = balance - wAmount;
		return balance;
	}

	double calculateInterest(double interest) {
		System.out.println("Enter amount to calculate the interest: ");
		interest = sc.nextDouble();
		double calculatedInterest = (balance * interest) / 100;
		return balance + calculatedInterest;
	}

	double transfer(BankAccount account, double amount) {
		balance = balance - amount;
		account.balance = account.balance + amount;
		return account.balance;

	}
}
