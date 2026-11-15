package com.consolebasedapplication;

import java.util.Scanner;

public class NaukariJobPortal {
	public static void main(String[] args) {

		System.out.println("Welcome to Naukri Job Portal");
		Scanner sc = new Scanner(System.in);
		System.out.println("Can you Please Enter your Name :");
		String name = sc.nextLine();
		System.out.println("Hello " + name + " Nice to meet you !!");

		System.out.println("Enter your highest qualification (B.Tech/M.Tech/MCA/etc.):");
		String highestQualification = sc.nextLine();

		if (highestQualification.equalsIgnoreCase("B.Tech") || highestQualification.equalsIgnoreCase("M.Tech")
				|| highestQualification.equalsIgnoreCase("MCA")) {
			System.out.println("your qualification matches the job requirement.");
			System.out.println("Enter your CGPA:");
			double cgpa = sc.nextDouble();

			if (cgpa >= 6.5) {
				System.out.println("Yes ,your eligible for job ,Lets Continue!!");
				System.out.println("Enter your Experience:");
				int expstatus = sc.nextInt();

				if (expstatus >= 1) {
					System.out.println("You are eligible based on experience");
					System.out.println("Enter your primary skill:");
					String skill = sc.next();
					sc.nextLine();

					if (skill.equalsIgnoreCase("Java") || skill.equalsIgnoreCase("Python")
							|| skill.equalsIgnoreCase("SQL")) {
						System.out.println("Your technical skills match the job requirement");
						System.out.println("Enter your current Location");
						String location = sc.nextLine();

						if (location.equalsIgnoreCase("Hyderabad")) {
							System.out.println("your location is available");
							System.out.println("Enter your Expected Salary");
							double expectedSalary = sc.nextDouble();
							double companyBudget = 50000.00;

							if (expectedSalary <= companyBudget) {
								System.out.println("your Salary expectation matches the company budget");
								System.out.println("Congratulations! You are seleted for the job.");

							} else {
								System.out.println(" Your Salary expectation is higher than the company budget");
							}

						} else {
							System.out.println("Sorry! This location is currently not available.");

						}

					} else {
						System.out.println("you need to improve your skills");
					}

				} else {
					System.out.println("Experience does not meet the current requirement");
				}

			} else {
				System.out.println("The Candidate is not eligible because academic criteria are not met");
			}

		} else {
			System.out.println("your qualification not matches the job requirement");
		}
	}
}
