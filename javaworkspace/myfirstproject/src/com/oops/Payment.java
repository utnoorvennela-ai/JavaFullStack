package com.oops;

import java.util.Scanner;

public interface Payment {
	Scanner sc = new Scanner(System.in);

	public abstract void makePayment();

	default void displayMessage() {
		System.out.println("Payment successfully completed");
	}

	class UPIPayment implements Payment {
		Scanner sc = new Scanner(System.in);
		int upiId;

		public UPIPayment(int upiId) {
			this.upiId = upiId;
		}

		@Override
		public void makePayment() {
			System.out.println("Enter your upi id");
			int id = sc.nextInt();
			if (id == upiId) {
				displayMessage();
			}
		}

	}

	class CreditCardPayment implements Payment {
		Scanner sc = new Scanner(System.in);
		int cardNumber;

		public CreditCardPayment(int cardNumber) {
			this.cardNumber = cardNumber;
		}

		@Override
		public void makePayment() {
			System.out.println("Enter your credit card number");
			int cn = sc.nextInt();
			if (cn == cardNumber) {
				displayMessage();
			}
		}

	}

	class NetBankingPayment implements Payment {
		Scanner sc = new Scanner(System.in);
		int pinNumber;

		public NetBankingPayment(int cardNumber) {
			this.pinNumber = pinNumber;
		}

		@Override
		public void makePayment() {
			System.out.println("Enter your pin number");
			int pn = sc.nextInt();
			if (pn == pinNumber) {
				displayMessage();
			}
		}

	}

	public class PaymentDetails {
		static Scanner sc = new Scanner(System.in);

		public static void main(String[] args) {
			System.out.println("Please Enter your id:");
			int id = sc.nextInt();
			Payment p1 = new UPIPayment(543256787);
			p1.displayMessage();
			Payment p2 = new CreditCardPayment(265312637);
			p2.displayMessage();
			Payment p3 = new NetBankingPayment(655432654);
			p3.displayMessage();

		}
	}
}
