package com.arrays;

public class CustomerBilling {

	public static void main(String[] args) {

		String[] products = { "BANANA", "GRAPES", "MANGO", "APPLES", "ORANGES" };
		int[] quantity = { 2, 1, 5, 3, 2 };
		double[] price = { 60.5, 150.0, 25.0, 40.0, 85.0 };

		double[] Bill = new double[products.length];
		double totalbill = 0;
		String highestproduct = "";
		String lowestproduct = "";

		double highest_Amount = Integer.MIN_VALUE;
		double lowest_Amount = Integer.MAX_VALUE;
		for (int i = 0; i < products.length; i++) {
			Bill[i] = quantity[i] * price[i];
			totalbill = totalbill + Bill[i];
			if (Bill[i] > highest_Amount) {
				highest_Amount = Bill[i];
				highestproduct = products[i];
			}
			if (Bill[i] < lowest_Amount) {
				lowest_Amount = Bill[i];
				lowestproduct = products[i];
			}
		}
		double Avgbill = totalbill / products.length;
		System.out.println("Products Total bill :" + totalbill);
		System.out.println("Products Average bill:" + Avgbill);
		System.out.println("Highest purchase product is " + highestproduct + " with the cost " + highest_Amount);
		System.out.println("lowest purchase product is " + lowestproduct + " with the cost " + lowest_Amount);

	}

}
