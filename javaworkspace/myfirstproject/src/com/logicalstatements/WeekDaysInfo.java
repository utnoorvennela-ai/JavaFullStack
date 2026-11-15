package com.logicalstatements;

import java.util.Scanner;

//WAP to print Week day informations..
public class WeekDaysInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a week day:");
		String day = sc.next().toUpperCase();

		switch (day) {

		case "MON" -> 
		System.out.println("Yes  !! Monday's are always Lazy Days");
		case "TUE", "WED", "THUR" -> 
		System.out.println("Tuesday,Wednesday & Thursday are the routine days");
		case "FRI" -> 
		System.out.println("Weekend mode started");
		case "SAT", "SUN" -> 
		System.out.println(" Saturday & Sundays are Holidays & Happy days");
		default -> 
		System.out.println("Something went wrong in your entry please check again");

		}

	}

}
