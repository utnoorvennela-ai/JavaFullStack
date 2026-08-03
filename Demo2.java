package com.introduction;

public class Demo2 {
	static int total = 100;
	static int pen = 7;
	static int totalcost_for_pens;
	static int remaining_cost;

	public static void main(String[] args) {
		totalcost_for_pens = total / pen;
		System.out.println(totalcost_for_pens);
		remaining_cost = total % pen;
		System.out.println(remaining_cost);

	}

}
