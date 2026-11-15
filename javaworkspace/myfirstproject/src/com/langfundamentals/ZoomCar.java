package com.langfundamentals;

import java.util.Scanner;

public class ZoomCar {
	// String companyName;
	int dailyRentalRate;
	int insuranceFee;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ZoomCar z1 = new ZoomCar();
		
		System.out.println(welcomemsg());
		System.out.println("Name of Company : " +companyName());
		
		double rate=dailyRentalRate();
		System.out.println("Enter Rental Rate:  " + rate);
		
		double insurance=insuranceFee();
		System.out.println("Insurance   : " + insurance );
		
		double rentalCost=z1.baseRentalCost(rate);
		System.out.println("Rental Cost  :  " + rentalCost);
		
		double totalCost=z1.totalCost(rentalCost,insurance);
		System.out.println("Total Cost : " + totalCost);
		
	}
	
	static String welcomemsg() {
		return "Welcome to Zoom Car Rentals";
	}

	static String companyName() {
		String zname = "ZoomCarRentals";
		return zname;

	}

	static double dailyRentalRate() {
		double rate = 1500;
		return rate;
	}
	
	static double insuranceFee() {
		double fee = 500;
		return fee;
	}

	double baseRentalCost(double rate) {
		System.out.println("Enter number of days:");
		int days = sc.nextInt();
		double baseCost = rate * days;
		return baseCost;
	}

	

	double totalCost(double baseCost, double fee) {
		double total = baseCost + fee;
		return total;
	}

}
