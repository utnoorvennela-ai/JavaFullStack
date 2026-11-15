package com.logicalstatements;

import java.util.Scanner;

public class Account {
	double balance = 20000.00;

	void main() {
		checkbalance();
		Scanner sc = new Scanner(System.in);
		System.out.println("");

	}

	void checkbalance() {
		System.out.println("The current balance is: " + balance);
	}
}
