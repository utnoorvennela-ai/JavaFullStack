package com.langfundamentals;

import java.util.Scanner;

// With Return Type + No Parameters
public class TypesOfJavaMethods {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method started !!");

		TypesOfJavaMethods j1 = new TypesOfJavaMethods();
		double salary = j1.employeeSalary();
		double bon = j1.empBonus();
		System.out.println("Total Salary is : " + (salary + bon));

		int sem1 = j1.firstSem();
		int sem2 = j1.secondSem();
		int sem3 = j1.thirdSem();
		int sem4 = j1.fourthSem();
		int sem5 = j1.fifthSem();
		int sem6 = j1.sixthSem();
		int sem7 = j1.seventhSem();
		int sem8 = j1.eighthSem();
		int total = sem1 + sem2 + sem3 + sem4 + sem5 + sem6 + sem7 + sem8;
		double avg = (double)total / 8;

		System.out.println("Total Marks is : " + total);
		System.out.println("Avg Marks is : " + avg);
		System.out.println("main method ended !!");
	}

	double employeeSalary() {
		System.out.println("Employee Salary is : ");
		double sal = sc.nextDouble();
		return sal;
	}

	double empBonus() {
		System.out.println("Enter Bonus :");
		double bonus = sc.nextDouble();
		return bonus;
	}

	int firstSem() {
		System.out.println("Enter First Sem Marks:");
		int sem1 = sc.nextInt();
		return sem1;
	}

	int secondSem() {
		System.out.println("Enter second Sem Marks:");
		int sem2 = sc.nextInt();
		return sem2;
	}

	int thirdSem() {
		System.out.println("Enter third Sem Marks:");
		int sem3 = sc.nextInt();
		return sem3;
	}

	int fourthSem() {
		System.out.println("Enter Fourth Sem Marks:");
		int sem4 = sc.nextInt();
		return sem4;
	}

	int fifthSem() {
		System.out.println("Enter Fifth Sem Marks:");
		int sem5 = sc.nextInt();
		return sem5;
	}

	int sixthSem() {
		System.out.println("Enter sixth Sem Marks:");
		int sem6 = sc.nextInt();
		return sem6;
	}

	int seventhSem() {
		System.out.println("Enter seventh Sem Marks:");
		int sem7 = sc.nextInt();
		return sem7;
	}

	int eighthSem() {
		System.out.println("Enter eighth Sem Marks:");
		int sem8 = sc.nextInt();
		return sem8;
	}

}
