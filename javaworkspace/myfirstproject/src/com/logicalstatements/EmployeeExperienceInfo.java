package com.logicalstatements;

import java.util.Scanner;

// WAP to give employee description based on experience
//0 → Fresher
//1 → Junior
//2 → Associate
//3 → Experienced
//4 → Senior
//5 → Expert
//Other → Invalid experience
public class EmployeeExperienceInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee Experience:");
		int experince = sc.nextInt();

		switch (experince) {

		case 0:
			System.out.println("Fresher");
			break;

		case 1:
			System.out.println("Junior");
			break;

		case 2:
			System.out.println("Associate");
			break;

		case 3:
			System.out.println("Experienced");
			break;

		case 4:
			System.out.println("Senior");
			break;

		case 5:
			System.out.println("Expert");
			break;

		default:
			System.out.println("Invalid Experience");

		}

	}

}
