package com.operators;

import java.util.Scanner;

public class StudentMarksDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("student marks");
		int marks = sc.nextInt();

		String result = (marks >= 91 && marks <= 100) ? "S Grade"
				: (marks >= 81 && marks <= 90) ? "A Grade"
						: (marks >= 71 && marks <= 80) ? "B Grade"
								: (marks >= 51 && marks <= 70) ? "C Grade"
										: (marks >= 41 && marks <= 50) ? "D Grade"
												: (marks >= 35 && marks <= 40) ? "E Grade"
														: (marks >= 0 && marks <= 34) ? "Failed" : "Invalid marks";
		System.out.println("The student marks :" + result);
		sc.close();

	}

}
