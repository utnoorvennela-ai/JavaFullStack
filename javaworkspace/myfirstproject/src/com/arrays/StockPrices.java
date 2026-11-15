package com.arrays;

public class StockPrices {

	public static void main(String[] args) {

		System.out.println("Stock prices Information:");
		String[] days = { "SUN", "MON", "TUE", "WED", "THURS", "FRI", "SAT" };
		int[] arr = { 10, 2, 9, 6, 5, 7, 9 };
		String buyDay = "";
		String sellDay = "";

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				buyDay = days[i];
			}
		}
		System.out.println("Buy Day is:"+buyDay);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				sellDay = days[i];
			}
		}
		System.out.println("Sell Day is:"+sellDay);

	}

}
