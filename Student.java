package com.introduction;

public class Student {
	static String collegeName = "KCEA";
	int studentId;
	String studentName;
	int englishMarks;
	int teluguMarks;
	int hindiMarks;
	int totalMarks;
	int percentage;

	void calculateTotal() {

		totalMarks = englishMarks + teluguMarks + hindiMarks;

	}

	void calculatePercentage() {

		percentage = totalMarks / 3;

	}

	void displayStudent() {
		System.out.println(" studentId:" + studentId);
		System.out.println("studentName:" + studentName);
		System.out.println("totalMarks:" + totalMarks);
		System.out.println("percentage:" + percentage);

	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();

		s1.studentId = 201;
		s1.studentName = "Vennela";
		s1.englishMarks = 60;
		s1.teluguMarks = 70;
		s1.hindiMarks = 70;

		s2.studentId = 202;
		s2.studentName = "Lahari";
		s2.englishMarks = 80;
		s2.teluguMarks = 60;
		s2.hindiMarks = 90;

		s1.calculateTotal();
		s1.calculatePercentage();
		s1.displayStudent();

		System.out.println("******************************************");

		s2.calculateTotal();
		s2.calculatePercentage();
		s2.displayStudent();

	}

}
