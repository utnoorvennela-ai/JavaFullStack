package com.introduction;

public class ATM {
	static String bankName = "SBI";
	long accNo;
	double balance;
	double deposit;
	double withdraw;
	double checkbalance;

	void deposit() {
		balance = balance + deposit;
	}

	void withdraw() {
		balance = balance - withdraw;
	}

	void checkBalance() {
		System.out.println("balance:" + balance);
	}

	public static void main(String[] args) {
		ATM acc1 = new ATM();
		ATM acc2 = new ATM();

		acc1.accNo = 123456789;
		acc1.balance = 5000;
		acc1.deposit = 3000;
		acc1.withdraw = 2000;

		acc2.accNo = 987654321;
		acc2.balance = 8000;
		acc2.deposit = 1000;
		acc2.withdraw = 5000;

		acc1.deposit();
		acc1.withdraw();
		acc1.checkBalance();

		acc2.deposit();
		acc2.withdraw();
		acc2.checkBalance();
	}

}
